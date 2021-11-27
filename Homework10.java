package homeworkWeek1_2;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if supermarket has full fat milk
		//if it on sale and expiration dater > 2 weeks ahead
		//buy 2 gallon full fat milk
		
	//else buy one gallon full fat milk
		
		//end
		
		//if they have 2% milk 
		// buy 2% milk
		// else buy skim milk
		
		
		
	Scanner scanner = new Scanner(System.in);
	String  inputExpirationDate = scanner.nextLine();
	String promotion = scanner.nextLine();
		

	
	
	if(inputExpirationDate.equals("1-14")&& promotion.equals("on sale"))
	{
		
		System.out.println("buy two gallon full fat milk");
	}		
	
	else 
	{if(inputExpirationDate.equals("15++")) {
		
		System.out.println("but one gallon full fat milk");
	}
	

		}
	}
}
		
	
	
	
	
	


	
