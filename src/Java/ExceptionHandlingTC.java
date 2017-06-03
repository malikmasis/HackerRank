package Java;

import java.util.InputMismatchException;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-exception-handling-try-catch
public class ExceptionHandlingTC {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		try {
			try {
				int a = in.nextInt();
				int b = in.nextInt();
				System.out.println(a / b);
			} catch (InputMismatchException InputMismatchException) {
				System.out.println("java.util.InputMismatchException");
			}
		} catch (ArithmeticException ArithmeticException) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

	}
}