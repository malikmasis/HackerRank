package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-exception-handling
class MyCalculator {
	public int power(int n, int p) throws Exception {
		int sonuc = 0;
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");

		} else {
			sonuc = (int) Math.pow(n, p);
		}
		return sonuc;
	}
}

public class ExceptionHandling{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
