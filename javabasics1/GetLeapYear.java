package javabasics1;

import java.util.Scanner;

public class GetLeapYear {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    System.out.println("Enter Year: ");
		    int year = s.nextInt();
		    boolean leap = false;  
		if(year >= 1582 )
		{
			if (year % 4 == 0) {
		      
		      if (year % 100 == 0) {
		        
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }            
		      else
		        leap = true;
		    }
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");  
		}
		else
			System.out.println("Try Again (greater than equal 1582)");

	}
}

