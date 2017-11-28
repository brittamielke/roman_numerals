package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int i) {
		String roman = "";
		int remainder = i;

		
		if (remainder >= 10) {
			int timesToLoop =remainder/10;
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
