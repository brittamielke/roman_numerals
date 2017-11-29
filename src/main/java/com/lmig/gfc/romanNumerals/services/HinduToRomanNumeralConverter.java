package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int i) {
		String roman = "";
		int remainder = i;

		if (remainder >= 1000) {
			int timesToLoop = remainder / 1000;
			while (timesToLoop > 0) {
				roman = roman + "M";
				remainder = remainder - 1000;
				timesToLoop = timesToLoop - 1;
			}
		}

		if (remainder >= 900) {
			roman = roman + "CM";
			remainder = remainder - 900;
		}
		if (remainder >= 500) {
			roman = roman + "D";
			remainder = remainder - 500;
		}
		if (remainder >= 400) {
			roman = roman + "CD";
			remainder = remainder - 400;
		}

		if (remainder >= 100) {
			int timesToLoop = remainder / 100;
			while (timesToLoop > 0) {
				roman = roman + "C";
				remainder = remainder - 100;
				timesToLoop = timesToLoop - 1;
			}
		}

		if (remainder >= 90) {
			roman = roman + "XC";
			remainder = remainder - 90;
		}
		if (remainder >= 50) {
			roman = roman + "L";
			remainder = remainder - 50;
		}
		if (remainder >= 40) {
			roman = roman + "XL";
			remainder = remainder - 40;

		}
		if (remainder >= 10) {
			int timesToLoop = remainder / 10;
			while (timesToLoop > 0) {
				roman = roman + "X";
				remainder = remainder - 10;
				timesToLoop = timesToLoop - 1;
			}
		}
		if (remainder >= 9) {
			roman = roman + "IX";
			remainder = remainder - 9;
		}
		if (remainder >= 5) {
			roman = roman + "V";
			remainder = remainder - 5;
		}
		if (remainder == 4) {
			roman = roman + "IV";
			remainder = remainder - 4;
		}
		if (remainder <= 3) {
			while (remainder > 0) {
				roman = roman + "I";
				remainder = remainder - 1;
			}

		}
		return roman;
	}
}
