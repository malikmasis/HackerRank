package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-negative-subarray
public class Subarray {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a = in.nextInt();
		int[] b = new int[100];

		for (int i = 0; i < a; i++) {
			b[i] = in.nextInt();
		}
		int h = 0;
		int toplams = 0;
		for (int k = 0; k < a; k++) {
			toplams = 0;
			for (int l = k; l < a; l++) {
				toplams += b[l];
				if (toplams < 0) {
					h++;
				}
			}
		}
		System.out.println("" + h);
	}
}