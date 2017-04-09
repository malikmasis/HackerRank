package Java;

import java.math.BigInteger;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-biginteger
public class BigIntegerr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		BigInteger k = new BigInteger(in.next());
		BigInteger y = new BigInteger(in.next());

		System.out.println(k.add(y));
		System.out.println(y.multiply(k));
	}
}