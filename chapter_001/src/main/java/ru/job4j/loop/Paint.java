package ru.job4j.loop;

/**
 * Paint.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 15.04.2017
*/
public class Paint {
	/**
	 * piramid.
	 * The method piramid(int h) builds a pyramid according to height that pass as a parameter;
	 * @param h -- the first parameter;
	*/
	public void piramid(int h) {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h * 2 - 1; j++) {
				if (j > h- i && j < h + i) {
					builder.append("*");
				} else {  
					builder.append(" ");
				}
			}
			System.getProperty("line.separator");
		} 
		System.out.printlln(builder.toString());
	}
