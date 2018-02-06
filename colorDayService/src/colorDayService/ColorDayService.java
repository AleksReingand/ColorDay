package colorDayService;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.aleksR.colorDay.DTO.ColorDTO;
import com.aleksR.colorDay.api.ColorDayConstants;
import com.aleksR.colorDay.interfaces.ColorInterface;
import com.aleksR.colorDay.model.ModelColorDay;

@SpringBootApplication
@RestController
public class ColorDayService {

	ColorInterface colorDay = new ModelColorDay();

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ColorDayService.class, args);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter exit for graceful shutdown");
			String line = sc.nextLine();
			if (line.equals("exit")) {
				SpringApplication.exit(ctx);
				break;
			}
		}
		sc.close();
	}

	@GetMapping(ColorDayConstants.COLOR_DAY)
	public String colorDayRes(@RequestParam(name = ColorDayConstants.STR) String str) {
		return getResponceColorService(colorDay.charToCodeColor(str));
	}

	private String getResponceColorService(StringBuilder str) {
		String codColor = str.toString();
		String url = "http://thecolorapi.com/";
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> requestEntity = new HttpEntity<>(codColor, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ColorDTO> response = restTemplate.exchange(
				url + ColorDayConstants.COLOR_NAME + "?hex=" + codColor, HttpMethod.GET, requestEntity, ColorDTO.class);
		return response.getBody().getName().getValue();
	}

}
