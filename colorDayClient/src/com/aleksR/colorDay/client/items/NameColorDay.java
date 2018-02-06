package com.aleksR.colorDay.client.items;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.aleksR.colorDay.api.ColorDayConstants;

import telran.view.InputOutput;

public class NameColorDay extends ItemsColorDay {

	public NameColorDay(InputOutput inputOutput) {
		super(inputOutput);
	}

	@Override
	public String displayedName() {
		return "Get name your color of the day.";
	}

	@Override
	public void perform() {
		String str = inputOutput.getString("Enter three any sumbol: ");

		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<String> innerResponce = restTemplate.exchange(
				localURL + ColorDayConstants.COLOR_DAY + "?sumbols=" + str, HttpMethod.GET, requestEntity,
				String.class);
		inputOutput.put(innerResponce.getBody());
	}

}
