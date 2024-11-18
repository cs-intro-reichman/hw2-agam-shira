// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args [0] ; // runi 
            String cheersUpperCases = cheers.toUpperCase(); // RUNI
            String condition = "AEFHILMNORSX" ;
            int numberOfCheering = Integer.parseInt(args [1]) ; // 3
            for ( int i = 0 ; i < cheersUpperCases.length() ; i++) {
                 char cheersChar = cheersUpperCases.charAt(i);
                if (condition.indexOf(cheersChar) != -1) { 
                        System.out.println("Give me an " + cheersChar + ": " + cheersChar + "!");
                } else {
                        System.out.println("Give me a " + cheersChar + ": " + cheersChar + "!");     
                } 
              }
                System.out.println("What does it spell?");
                for ( int j = 0 ; j < numberOfCheering ; j ++ ) {
                System.out.println(cheersUpperCases +"!!!");
                } 
            }
        }
   
        
