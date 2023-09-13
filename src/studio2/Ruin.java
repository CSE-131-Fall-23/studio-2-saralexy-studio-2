package studio2;
import java.util.Random;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("start amount: ");
		int startAmount = in.nextInt();
		System.out.println("win chance: ");
		double winChance = in.nextDouble();
		System.out.println("win limit: ");
		int winLimit = in.nextInt();
		double num;
		int simulation = 0;
		System.out.print("How many simulations do you want to run?");
		int totalSimulations = in.nextInt();
		int numPlays = 0;
		String result = "";
		
	while (simulation <= totalSimulations) 
	{	
		while(startAmount < winLimit && startAmount > 0) 
		{
			numPlays = 0;
			
			num = Math.random();
						
			if(num > winChance)
			{
				startAmount -= 1;
				//System.out.println("DOWN by 1: " + startAmount);
			}
			else if(num <= winChance)
			{
				startAmount += 1;
				//System.out.println("UP by 1: " + startAmount);
			}
			
			numPlays+=1;
		}
		
		if(startAmount == 0)
		{
			result = "LOSE";
		}
		else
		{
			result = "WIN";
		}
		
		System.out.println("Simulation " + simulation + ": " + numPlays + " " + result);
		
		simulation += 1;
	}		
				

	}

	private static Object simulation(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
