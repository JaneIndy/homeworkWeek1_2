package homeworkWeek1_2;

public class homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String memberType = "premium";
		
		int shippingCost = 0;
		
		
		int cartTotal = 90;
		
		if((cartTotal > 100) || (memberType == "premium") ) { 
			shippingCost=0;
			
			System.out.println("you qualify for free shipping ");
		
		}else 
			if((cartTotal <= 100) || (memberType != "premium") ) {
					
		
			System.out.println("you are not qualify for free shipping");
			
		
	}
	}
}
		

	


	

	
	

		
		
		
	
		
		

	


