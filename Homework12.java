package homeworkWeek1_2;

public class Homework12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 4:

		//	Write a program that asks the user to input
		//an integer and then outputs the number with the digits reversed. 
		//For example, 
		//	if the input is 34567, the 
		//	output should be 76543.
		
	
		
		
		
		for(int a=3; a<=7;a++ ) {
			System.out.println(a);
		}
	System.out.println("________________");
		
		for(int c=7;c>=3;c--) {
			System.out.println(c);
		}
	System.out.println("_____________");
		
	int b = 7;
		do{
			System.out.println(b);
			b--;
		}while (b>=3);
		
		
		
		System.out.println("_______________");
		
		
		int o=3;
		while(o <= 7) {
			System.out.println(o);
			o++;
		System.out.println("_______________");
		int q=7;
		while(q >=3) {
		System.out.println(q);	
		--q;
			
			}
		}
		System.out.println("__________________");
//
///			Task 5:
//
//			Write a program that reads a set of integers,
		//and then prints the sum of the even and odd integers.
//
//			Range is 1 to 100;
//			output:
//
//				Sum of all odd number
//			         and 
//				Sum of all even number
		
			int sum = 0;
		for(int c =1; c<=100; c++) {
			if(c%2==0) {
			System.out.println(c);
				System.out.println(sum+=c);
		
		int sum1 =0;
		 for(int d=1;d<=100;d++) {
			if(d%2==1) {
				System.out.println(sum1+=d);
				System.out.println("-------------");
		}
			}
		
//
//			
			
			
		//	Task 6:
//			Print numbers from 1 to 50 except those that are divisible by 3/*
		
		
		for(int e = 0; e<=50; e++) 
			if(e%3!=0) {
				System.out.println(e);
			
			}
		
		
//		Task 7
//			 Write a program that will print out all letters in English alphabet in ascending order
//
	//	 for(int a= 65; a<=90; a++) {
	//			char charValue = (char) a;
	//			System.out.println(charValue);
	//		 }
		
//		 Task 8:
//			 Write a program that will print out all letters in English alphabet in descending order
			 
		for (int a=90;a >64 ;--a) {
			char charValue =(char)a;
			System.out.println(charValue);
		}
		 
		 
		 
		 
//		 Task 9:
//			Write a program which prints out the numbers from 1 to 30:
//		 1. for numbers which are divisible by 3, print "FIN" instead of the number.
//		 2. for numbers which are divisible by 5, print "RA" instead of the number
//		 3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
//
//			        Ex:
//	//          1 2 FIN 4 RA FIND .... FINDRA

		
		for(int z = 1; z<=30; z++) {
			
		
			if(z%3==0 && z%5==0) {
				System.out.println("FINRA");
			}
			else if(z%5 == 0) {
				System.out.println("RA");
			}
			else if(z%3==0){
				System.out.println("FIN");
			}
			else {
				System.out.println(z);
			}
	}	
		
	
	}
		}
	}
}

	


