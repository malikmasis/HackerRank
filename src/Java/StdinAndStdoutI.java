package Java;
import java.util.*;

//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
public class StdinAndStdoutI {

    private static Scanner scan;

	public static void main(String[] args) {
        scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
