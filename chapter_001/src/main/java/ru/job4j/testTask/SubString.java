package ru.job4j.testTask;

/**
 * SubString.
 *
 * @author mklimentiev
 * @version 2.0
 * @since 07.05.2017
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

		//There check that the length of the array subChar is greater or equal to the array originChar
		if (subChar.length <= originChar.length) {
			//There find the first char of the array subChar in the array originChar
			//The search is limited (originChar.length - subChar.length + 1) because further it does not make sense
			for (int i = 0; i < originChar.length - subChar.length + 1; i++) {
				if (originChar[i] == subChar[0]) {
					subIsSubstringOfOrigin = true;
					//There check that all the characters from the second to the last of the array subChar match to the array originChar
					for (int j = i + 1; j < i + subChar.length; j++) {
						if (originChar[j] != subChar[j - i]) {
							subIsSubstringOfOrigin = false;
							return subIsSubstringOfOrigin;
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

