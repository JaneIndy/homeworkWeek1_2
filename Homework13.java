package homeworkWeek1_2;

import java.util.Scanner;

public class Homework13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a basic calculator using if else statement.
		//Note: Create a String variable name it operator. 
		//Create 3 numeric variable, total, num1 and num2 and perform basic calculation. 

		
		String operator;  
		int num1, num2,num3;
		
		Scanner total = new Scanner(System.in);
		
		System.out.println("enter first number");
		num1 =total.nextInt();
		
		System.out.println("enter second number");
		num2= total.nextInt();
		
		System.out.println("enter operator + - * /");
		operator = total.next();
		
		if (operator.equals("+")) {num3 = num1 + num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else if (operator.equals("-")) {num3 = num1 - num2;
		System.out.println(num1+" "+ operator + " " +num2 + "="+num3);
		}
		else if (operator.equals("*")) {num3 = num1 * num2;
		System.out.println(num1 +" " + operator + " "+ num2 + "="+num3);
		}
		else if (operator.equals("/")) {num3 = num1 / num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else
			System.out.println("invalid");
		
		
		total.close();
		
	}

}
