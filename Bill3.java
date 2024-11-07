// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    // Replace this comment with the rest of your code

		double price = Double.parseDouble(args[3]);
		double people = 3;
		String nemaA = args[0];
		String nemaB = args[1];
		String nemaC = args[2];


		double priceOfOne = Math.ceil(price/people);
		System.out.print("Dear "+nemaC+", "+nemaB+" and "+nemaA+":");
		System.out.print("pay "+priceOfOne+" Shekels each. ");
	  
	}
}
