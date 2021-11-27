package homeworkWeek1_2;

import java.util.Scanner;

public class HomeWork11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program that ask the user to input a positive integer.

	//It should then print the multiplication table of that number
		// range of the number is between 1-20
		//input :5
		//output:
		//		1*5 = 5
		//		2*5 = 10
		//		3*5 = 15
		//		10*5 = 50
	
		
		Scanner scan = new Scanner(System.in);
		//int input  = 5; 
		
	System.out.println("type a number between 1-10");
	 int input= scan.nextInt();
		
			for(int i =1; i<=10; i++) {
				System.out.println(input+"X"+i+ "= " + i*input);
				
		}
		
		scan.close();
		
	}

}
