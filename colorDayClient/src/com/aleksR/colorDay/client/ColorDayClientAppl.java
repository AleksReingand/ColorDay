package com.aleksR.colorDay.client;

import java.util.ArrayList;

import com.aleksR.colorDay.client.items.NameColorDay;

import telran.view.ConsoleInputOutput;
import telran.view.ExitItem;
import telran.view.Item;
import telran.view.Menu;

public class ColorDayClientAppl {
	static ConsoleInputOutput inputOutput = new ConsoleInputOutput();

	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<>();
		Menu menu = new Menu(items, inputOutput);

		items.add(new NameColorDay(inputOutput));
		items.add(new ExitItem(inputOutput));
		menu.runMenu();

	}

}
