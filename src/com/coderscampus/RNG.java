package com.coderscampus;
import java.util.Random;

public class RNG {
Integer getNumber() {
	Random random = new Random();
	Integer randomInteger = random.nextInt(101);
	
	if (randomInteger == 0)
	{
		while (randomInteger == 0)
		{
			randomInteger = random.nextInt(101);
			
		}
	}
		return randomInteger;
	
}
}
