package kata.Root;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) {
        System.out.println( "enter a number" );
  
        double num;
          
        Scanner s = new Scanner(System.in);
        num = s.nextDouble();
          
        if(num > 0) {
          System.out.println("positive");
        }
        else if(num < 0) {
          System.out.println("negative");
        }
        
	
	}
    
    
}

//Driver registeredDriver;
//
//public void registerDriver (String[] driverFields) {
//	if (driverFields[0].contentEquals("Driver")) {		
//		registeredDriver.setName(driverFields[1]);
//	}		
//}