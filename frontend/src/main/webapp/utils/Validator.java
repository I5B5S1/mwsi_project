package main.webapp.utils;

import java.util.Arrays;
import java.util.List;

import main.webapp.exception.ValidationException;

public class Validator {
	private static final int VIN_LENGTH = 17;
	private static final int[] WEIGHTS = { 8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2 };
	private static final List<Character> PROPER_CHARACTERS;
	static {
		PROPER_CHARACTERS = Arrays
				.asList(new Character[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R',
						'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });
	}

	public static void validateBoolean(String bool) throws ValidationException {
		if (!"tak".equals(bool) && !"nie".equals(bool) && bool != null) {
			throw new ValidationException();
		}
	}

	public static void validateDate(String date) throws ValidationException {
		validateDateFormat(date);
		validateDateDay(date);
		validateDateMonth(date);
	}

	private static void validateDateFormat(String date) throws ValidationException {
		if (!date.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
			throw new ValidationException();
		}
	}

	private static void validateDateDay(String date) throws ValidationException {
		int day = Integer.parseInt(date.substring(0, date.indexOf('/')));
		if (day > 12 || day < 1) {
			throw new ValidationException();
		}
	}

	private static void validateDateMonth(String date) throws ValidationException {
		int month = Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/')));
		if (month > 12 || month < 1) {
			throw new ValidationException();
		}
	}

	public static void validateVin(String vin) throws ValidationException {
		if (vin.length() == VIN_LENGTH) {
			for (int i = 0; i < VIN_LENGTH; i++) {
				isProperCharacter(vin.charAt(i));
			}
			if (vin.charAt(8) == calcChecksum(vin)) {
				return;
			}

		}
		throw new ValidationException();
	}

	private static void isProperCharacter(char character) throws ValidationException {
		if (!PROPER_CHARACTERS.contains(character)) {
			throw new ValidationException();
		}
	}

	private static char calcChecksum(String vin) {
		int crc = 0;
		for (int i = 0; i < VIN_LENGTH; i++) {
			crc += WEIGHTS[i] * resolveCharacterValue(vin.charAt(i));
		}
		return (crc %= 11) == 10 ? 'X' : Character.forDigit(crc, 10);
	}

	private static int resolveCharacterValue(int c) {
		return c <= '9' ? c - '0' : ((c >= 'S' ? c + 1 : c) - 'A') % 9 + 1;
	}

}
