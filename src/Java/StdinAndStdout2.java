package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-stdin-stdout
public class StdinAndStdout2 {
	   public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        
	        String e = scan.nextLine();
	        String s = scan.nextLine();
	        // Write your code here.
	        
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
	
	
	
}
