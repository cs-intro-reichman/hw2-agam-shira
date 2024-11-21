
public class Collatz {
	public static void main(String args[]) {
	int N = Integer.parseInt(args [0]) ;
	String mode = args [1];
	for(int i = 1; i<= N ; i++){
		int seed = i;
		int countForIteration = 1;
	do {
		if ( mode.equals("v")) {
			System.out.println(seed + " ");
		}
		if (seed % 2 == 0) {
			seed = seed / 2;
		} else {
			seed = (seed * 3) + 1;
		}
		countForIteration ++;
	} while (seed != 1);
	if (mode.equals("v")) {
		System.out.print(seed +" (" + countForIteration + ")");
		System.out.println();
	}
	countForIteration ++;
		}
	}
}

