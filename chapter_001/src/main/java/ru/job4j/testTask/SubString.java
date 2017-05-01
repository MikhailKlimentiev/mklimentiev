package ru.job4j.testTask;

/**
 * SubString.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class SubString {

	/**
	 * contains.
	 * The method boolean contains(String origin, String sub) gets two arrays of strings
	 * transfers them into arrays of char and returns boolean value whether the array origin contains the array sub
	 * @param origin -- an array of strings
	 * @param sub -- an array of strings
	 * @return boolean value whether the array origin contains the array sub
	*/
	boolean contains(String origin, String sub) {

		char[] originChar = origin.toCharArray();
		char[] subChar = sub.toCharArray();
		boolean subIsSubstringOfOrigin = false;

		if (subChar.length <= originChar.length) {
			for (int i = 0; i < originChar.length - subChar.length + 1; i++) {
				if (originChar[i] == subChar[0]) {
					subIsSubstringOfOrigin = true;
					for (int j = i + 1; j < i + originChar.length; j++) {
						if (originChar[j] != subChar[j - i]) {
							subIsSubstringOfOrigin = false;
							break;
						}

						if (subIsSubstringOfOrigin) {
							return subIsSubstringOfOrigin;
						}
					}
				}
			}
		}
		return subIsSubstringOfOrigin;
	}
}

