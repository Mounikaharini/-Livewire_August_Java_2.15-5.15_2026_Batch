package TheoryClasses;

public class Day3task2 {

	public static void main(String[] args) {
		
		// simple if
		String paymentMethod = "gpay";
		if(paymentMethod.equals("paytm")) {
			System.out.println("Proceed to pay");
		}

		//if - else
		String paymentMethod = "gpay";
		if(paymentMethod.equals("paytm")) {
			System.out.println("Proceed to pay");
		}
		else {
			System.out.println("No need to Pay");
		}
		
		//if - els if - else
		String paymentMethod = "gpay";
		if(paymentMethod.equals("paytm")) {
			System.out.println("Proceed to pay");
		}
		else if(paymentMethod.equals("phonepe")) {
			System.out.println("Proceed to pay");
		}
		else if(paymentMethod.equals("gpay")) {
			System.out.println("Proceed to pay");
		}
		else {
			System.out.println("No need to Pay");
		}
		
		//if - else
		String paymentMethod = "gpay";
		int pin = 1234;
		if(paymentMethod.equals("gpay")) {
			if(pin==1234) {
				System.out.println("Proceed to pay");
			}
			else {
				System.out.println("Incorrect pin number");
			}
		}
		else {
			System.out.println("Gpay Only Accepted");
		}
		
		
		
		
		
	}

}
