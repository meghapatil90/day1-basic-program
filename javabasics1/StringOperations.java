package javabasics1;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = s.next();
		System.out.println("Enter String 2: ");
		String str2 = s.next();
		System.out.println("ToUpperCase: "+str1.toUpperCase());
		System.out.println("ToLowerCase: "+str2.toLowerCase());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.trim());

	}

}


