package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-substring
public class Substring  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
        
    }
}
