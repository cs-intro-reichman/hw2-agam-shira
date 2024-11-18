public class TimeCalc { 
    public static void main(String[] args) {
     String hoursMinutes = args[0]; 
     int hours = Integer.parseInt(""+hoursMinutes.charAt(0) + hoursMinutes.charAt(1));
     int minutes = Integer.parseInt(""+hoursMinutes.charAt(3) + hoursMinutes.charAt(4));
     int minuteToAdd = Integer.parseInt( args[3] ) ; //12345 , 10
     int totalMinutes = ( hours * 60 ) + minutes +minuteToAdd ; // 22*60 + 07 +12345 = 13672 ,23*60 +59 +10 =1449
     int totalHours = totalMinutes / 60 ; //227 , 24
     int newHours = totalHours % 24 ; // 11 , 0
     int newMinutes = totalMinutes - ( totalHours * 60 ) ; //13672 - (227*60) = 52 ,1449 - (24*60) = 9 
     System.out.println( "New hours: " + newHours ) ;
     System.out.println( "New minutes: " + newMinutes ); 
    } 
 }
 