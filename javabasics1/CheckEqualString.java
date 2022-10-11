package javabasics1;

import java.util.Scanner;

public class CheckEqualString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String:");
		String str1 = sc.next();
		System.out.println("Enter 2nd String:");
		String str2 = sc.next();
		if(str1.equalsIgnoreCase(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}


