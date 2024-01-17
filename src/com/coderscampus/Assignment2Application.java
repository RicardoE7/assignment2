package com.coderscampus;
import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("Pick a number between 1 and 100");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		Integer convertedInput = Integer.parseInt(input);
		
		RNG numGen = new RNG();
		
		Integer savedGen = numGen.getNumber();
		
		UserToRandom gameStart = new UserToRandom();
		
		gameStart.compare(convertedInput, savedGen);
		

	}

}
