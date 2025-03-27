import java.util.Scanner;
public class Factorial{					
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
                System .out .print ("Enter a number:");   
		int num = scanner. nextlnt();
 		
		int factorial=1;
		for (int i=1;1<=num;i++){

		factorial*=i;
		}
		System.out.println("The factorial"+num+"is:"
+factorial);
	}
}