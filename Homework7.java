package homeworkWeek1_2;

public class Homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if balance >1000 AND accountType =="saving"
	String accounttype = "saving";
			float interestRate = 0.02f;
			int balance =1800;
		
			
			if (balance > 1000 && accounttype == "saving") {
			
			System.out.println((interestRate * balance) + balance);
			System.out.println((interestRate*balance) + balance/12);
			
			}else {
				
			System.out.println("invalid");
			}
		
	}

}
