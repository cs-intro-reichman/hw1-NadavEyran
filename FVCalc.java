// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt (args[0]);
		double rate = Double.parseDouble (args[1]);
		int n = Integer.parseInt (args[2]);


		double futureValueDouble = currentValue*(Math.pow(1+(rate/100.0),n)) ;
		int futureValue = (int) futureValueDouble;
		
		System.out.print("After " + n + " years, a ");
		System.out.print("$" + currentValue + " saved at " + rate + "% will yield $" + futureValue);

	}
}