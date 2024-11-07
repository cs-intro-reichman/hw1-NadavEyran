// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int limNumber = Integer.parseInt(args[0]);

        int randomA = (int) (Math.random() * limNumber);
        int randomB = (int) (Math.random() * limNumber);
        int randomC = (int) (Math.random() * limNumber);

		System.out.println(randomA+" "+randomB+" "+randomC);

		int max0 = Math.max(randomA,randomB);
		int max1 = Math.max(max0,randomC);

		int min0 = Math.min(randomA,randomB);
		int min1 = Math.min(min0,randomC);

		int sum = randomA+randomB+randomC;
		int middle = sum-max1-min1;

		System.out.println(min1+" "+middle+" "+max1);	
	
	}
}
