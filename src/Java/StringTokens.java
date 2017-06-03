package Java;
//https://www.hackerrank.com/challenges/java-string-tokens
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNext()) {
			System.out.print(0);
			return;
		}
		String s = scan.nextLine();
		String regex = "[.,?@!'_ ]+";
		int a = 0;
		String[] b = new String[1100000];
		if (s.length() != 0) {
			for (String m : s.trim().split(regex)) {
				b[a] = m;
				a++;
			}

			System.out.println(a);
			for (int i = 0; i < a; i++) {
				System.out.println(b[i]);
			}
		}
		scan.close();
	}
}
