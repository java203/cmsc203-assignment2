package dices;

import java.util.Scanner;

public class dice {
	public static void main(String[] args){
		
		RNG count = new RNG();
		int counts = count.getCount();
		
		RNG num = new RNG();
		int number = num.rand();
		boolean loop = true;
		boolean loop2 = true;
		
		int low = 0;
		int high = 100;

		
		while(loop2 = true) {
		
		System.out.println("Enter your first guess");
//		Scanner scan = new Scanner(System.in);
//		int guess = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int aGuess = scan2.nextInt();
		
		
		if (aGuess>=high || aGuess<=low)
		{
			RNG no = new RNG();
			no.inputValidation(aGuess, low, high);
			counts++;
		}
		else if(aGuess > number)
		{
			
		    high = aGuess;
			System.out.println("Your guess is too high");
			counts++;
			
		}
		else if(aGuess < number) {
			low = aGuess;
			System.out.println("Your guess is too low");
			counts++;
		}
		
		
		if(aGuess == number)
		{
			loop = false;
		}
		
		while(loop == true)
		{

			System.out.println("Number of guess is " + counts);
			System.out.println("Enter your guess between " + low + " and " + high);
			Scanner scan3 = new Scanner(System.in);
			aGuess = scan3.nextInt();
			
			if (aGuess>=high || aGuess<=low)
			{
				RNG no = new RNG();
				no.inputValidation(aGuess, low, high);
				counts++;
			}
			else if(aGuess > number)
			{
				high = aGuess;
				System.out.println("Your guess is too high");
				counts++;
			}
			else if(aGuess < number){
				low = aGuess;
				System.out.println("Your guess is too low");
				counts++;
			}
			
			if(aGuess == number)
			{
				loop = false;
			}
		}
		
		if(loop == false)
		{
			
			System.out.println("Congrats, you guessed correctly");
			System.out.println("Try again?");
			Scanner scan3 = new Scanner(System.in);
			String confirm = scan3.nextLine();
			if(confirm.equals("yes")) {
				number = num.rand();
				counts = 0;
				low = 0;
				high = 100;
				loop = true;
			}
			else {
				System.out.println("Thanks for playing");
				System.out.println("Made by: David Do");
				//loop2 = false;
				break;
			}
		}
		
		}
	   }
}