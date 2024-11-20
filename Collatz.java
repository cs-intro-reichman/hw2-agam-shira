// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int num = Integer.parseInt(args[0]);
	   String mode = args[1].toLowerCase();
	   for( int i = 0; i <= num ; i++ ) {
		int seed = i;
		int iterationCount = 1;
		do {
			if(mode.equals("v") ) {
				System.out.print(seed + " ");
			}
			if(seed % 2 == 0) {
				seed = seed / 2;
			} else {
				seed = (seed * 3) + 1;
			}
			iterationCount ++;
		}
		while (seed != 1);
		if (mode.equals("v")) {
			System.out.print(seed + " (" + iterationCount + ")");
			System.out.println();
		}
		iterationCount ++;
	   }
	   System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
	}
}
