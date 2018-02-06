package com.aleksR.colorDay.model;

import com.aleksR.colorDay.interfaces.ColorInterface;

public class ModelColorDay implements ColorInterface {

	@Override
	public StringBuilder charToCodeColor(String sumbols) {

		String mes = "Wrong enter!";

		if (sumbols.length() != 3) {
			throw new RuntimeException(mes);
		}
		char[] arr = sumbols.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char ch : arr) {
			if (ch >= '!' && ch <= '}') {
				int num = ch;
				builder.append(Integer.toHexString(num));
			} else {
				throw new RuntimeException(mes);
			}
		}
		return builder;
	}

}
