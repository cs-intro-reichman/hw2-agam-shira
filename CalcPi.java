// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	  int numberOfTerms = Integer.parseInt(args [0] );
	  double approximatedPi = 0.0;
	  for (int i = 0 ; i< numberOfTerms ; i++ )
	  {
		Double calcuation = ( 1.0 / (2 * i + 1) ) ; 
		/*
		 * כדי למצוא את המיקום - צריך לבדוק חוקיות מתי מוסיפים ומתי מחסירים את האיבר
		 *   לפי הדוגמא איבר במקום האפס אפשר מקבלים אותו כפלוס אבל במקום האחד 
		 *  2 מקבלים במינוס וכן הלאה בכפולות של 2 ולכן אני יכולה להשתמש במודלו
		 */
		
		if ( i % 2 == 0 )
		{
			approximatedPi += calcuation;
		} else {
			approximatedPi -= calcuation;
		}
	  } 
	  System.out.println("pi according to Java: " + Math.PI);
	  System.out.println("pi, approximated: " + 4 * (approximatedPi));
}
}
	
