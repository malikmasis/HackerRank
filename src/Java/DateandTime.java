package Java;

import java.time.LocalDate;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-date-and-time
public class DateandTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mm = in.nextInt();
		int dd = in.nextInt();
		int yy = in.nextInt();
		in.close();
		LocalDate dt = LocalDate.of(yy, mm, dd);
		System.out.print(dt.getDayOfWeek());
	}
}