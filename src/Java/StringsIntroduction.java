package Java;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-strings-introduction
public class StringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        String a = A.substring(0, 1);
        String b = B.substring(0, 1);
        System.out.println(a.toUpperCase()+A.substring(1,A.length()).toLowerCase()+
        		       " "+b.toUpperCase()+B.substring(1,B.length()).toLowerCase());
    }
}