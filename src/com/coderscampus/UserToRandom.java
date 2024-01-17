package com.coderscampus;
import java.util.Scanner;

public class UserToRandom {
String compare(Integer a, Integer b) {
	String output = "";
	int i = 1;

	
	while (a > 100 | a < 1)
	{
		System.out.println("Your guess is not between 1 and 100, please try again:");
		Scanner newScanner1 = new Scanner(System.in);
		String newInput1 = newScanner1.nextLine();
		Integer newConvertedInput1 = Integer.parseInt(newInput1);
		a = newConvertedInput1;
	}
	
	while (i <= 5)
		
	{
		if (a == b)
		{
			output = "You win!";
			System.out.println(output);
			return output;
		}
		else if(i == 5)
		{
			output = "You lose, the number to guess was " + b;
			System.out.println(output);
			return output;

		}
		else if (a > b) {
			output = "You have " + (5 - i) + " tries left. Pick a lower number:";
			i++;
			System.out.println(output);
			Scanner newScanner2 = new Scanner(System.in);
			String newInput2 = newScanner2.nextLine();
			Integer newConvertedInput2 = Integer.parseInt(newInput2);
			a = newConvertedInput2;
		}
		else if (a < b)
		{
			output = "You have " + (5 - i) + " tries left. Pick a higher number:";
			i++;
			System.out.println(output);
			Scanner newScanner3 = new Scanner(System.in);
			String newInput3 = newScanner3.nextLine();
			Integer newConvertedInput3 = Integer.parseInt(newInput3);
			a = newConvertedInput3;
		}
	}
	
	
	return output;
}
}
