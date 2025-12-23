package com.jsp.vintyaa;

import java.util.Iterator;
import java.util.Scanner;

public class Occuu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to count: ");
		
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
        System.out.println("Character '" + ch + "' appears " + count + " times.");
	}

}
