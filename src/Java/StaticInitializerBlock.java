package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-static-initializer-block
public class StaticInitializerBlock {

	static Scanner sc = new Scanner(System.in);
	static int H = sc.nextInt();
	static int B = sc.nextInt();

	static boolean flag() {
		boolean flag = false;
		if (H > 0 && B > 0) {
			flag = true;
		} else {
			try {
				System.out
						.println("java.lang.Exception: Breadth and height must be positive");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;

	}

	static boolean flag = flag();

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
