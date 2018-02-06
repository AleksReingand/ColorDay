package com.aleksR.colorDay.DTO;

public class ColorDTO {
	Hex hex;
	Rgb rgb;
	Hsl hsl;
	Hsv hsv;
	Name name;
	Cmyk cmyk;
	XYZ xyz;
	Image image;
	Contrast contrast;
	Links _links;
	Embedded _embedded;

	public Hex getHex() {
		return hex;
	}

	public Rgb getRgb() {
		return rgb;
	}

	public Hsl getHsl() {
		return hsl;
	}

	public Hsv getHsv() {
		return hsv;
	}

	public Name getName() {
		return name;
	}

	public Cmyk getCmyk() {
		return cmyk;
	}

	public XYZ getXyz() {
		return xyz;
	}

	public Image getImage() {
		return image;
	}

	public Contrast getContrast() {
		return contrast;
	}

	public Links get_links() {
		return _links;
	}

	public Embedded get_embedded() {
		return _embedded;
	}

}
