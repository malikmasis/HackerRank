package Java;
import java.io.*;
import java.util.*;
//https://www.hackerrank.com/challenges/java-loops-i
public class LoopsI {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        for(int i = 1 ; i<=10 ; i++){
            result= n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}