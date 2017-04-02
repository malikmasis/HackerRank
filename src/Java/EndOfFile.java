package Java;
import java.io.IOException;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-end-of-file
public class EndOfFile {

  	public static void main(String[] argh) throws IOException {
   
           Scanner scan = new Scanner(System.in);
		   int i = 1;
		   while(scan.hasNext()){
		       System.out.println(i + " " + scan.nextLine());
		       i++;
		   }
    }
}