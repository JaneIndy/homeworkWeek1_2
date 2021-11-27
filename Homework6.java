package homeworkWeek1_2;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a Java Program using nested if statement.
		 Find the largest value between the 3 numbers below.
			n1 = -1.0
                           n2 =  4.5
                           n3 = -5.3
*/
		
		float n1= -1.0f;
		float n2= 4.5f;
		float n3= -5.3f;
		
		 
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " "
					+ "is largest numer");
		}else {
		if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is largest number");
		}else {
			System.out.println(n3 + " is largest number");
	}
	}

	}
}
