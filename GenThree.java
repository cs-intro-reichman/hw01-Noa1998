/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]); 

        int A = (int) ( Math.random()*(max - min) + min);
        int B = (int) ( Math.random()*(max - min) + min);
        int C = (int) ( Math.random()*(max - min) + min);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        int lowest = Math.min(A, Math.min(B, C));
        System.out.println("The minimal generated number was "+lowest);
        	}

	}

