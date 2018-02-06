package com.aleksR.colorDay.client.items;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import telran.view.InputOutput;
import telran.view.Item;

public abstract class ItemsColorDay extends Item {

	public ItemsColorDay(InputOutput inputOutput) {
		super(inputOutput);
	}

	static String url = "http://thecolorapi.com/";
	static String localURL = "http://localhost:8080";
	
	static HttpHeaders headers = new HttpHeaders();
	RestTemplate restTemplate = new RestTemplate();

}
