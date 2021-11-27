package homeworkWeek1_2;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //if supermarket has full fat milk
	
		//if it on sale and expiration dater > 2 weeks ahead
			//buy 2 gallon full fat milk
			
		//else buy one gallon full fat milk
			
			//end
			
			//if they have 2% milk 
			// buy 2% milk
			// else buy skim milk
		boolean fullFatMilk= true; 
		boolean milkOnSale= true;	
		boolean reduceFatMilk = true;
		boolean skimMilk = false;
		 
		 
	Scanner scanner = new Scanner(System.in);
	int numOfDay = scanner.nextInt();
	
	
	if(fullFatMilk ==true) {
	
		if( numOfDay <= 14 && fullFatMilk==milkOnSale) {
		System.out.println("buy 2 gallon full fat milk");
		
		
	}else {
		System.out.println("buy 1 gallon full fat milk");
		
	}

	}else
		if(reduceFatMilk == true) {
		
	System.out.println("buy 2% milk");
	
		}else {System.out.println("Buy skimmed milk");
	}
		
	
			
		
	}
	
}





