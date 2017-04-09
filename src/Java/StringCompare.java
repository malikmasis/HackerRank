package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-compare
public class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String big = "aaa", small = "zzz";
		int cutInputLength = sc.nextInt();
		String[] cuttedInput = new String[10000];
		small = input.substring(0, 0 + cutInputLength);
		big = input.substring(0, 0 + cutInputLength);
		System.out.println(input.length());
		for (int i = 1; i < input.length() - cutInputLength + 2; i++) {
			cuttedInput[i - 1] = input.substring(i - 1, i - 1 + cutInputLength);
			System.out.println(cuttedInput[i - 1] + "--");
			if (cuttedInput[i - 1].compareTo(big) > 0) {
				big = cuttedInput[i - 1];
			} else if (cuttedInput[i - 1].compareTo(small) < 0) {
				small = cuttedInput[i - 1];
			}
		}
		System.out.println(small);
		System.out.println(big);
	}
}