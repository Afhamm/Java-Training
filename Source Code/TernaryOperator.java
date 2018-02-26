class TernaryOperator {

	public static void main(String[] args) {

		double number = -5.5;
		String result;

	result = (number > 0.0) ? "positive" : "negative";

	System.out.println(number + "is" + result);
        
	
 	if(number < 0.0) {

	System.out.println(number + "is negative");
	
	}

	else {
	
	System.out.println(number + "is positive");
	}
   }
}