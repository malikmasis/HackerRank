package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-string-reverse
public class Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int m =0;
        char a[] = A.toLowerCase().toCharArray();
        for(int i=0 ; i<A.length() ; i++){
        	if(a[i]==a[A.length()-1-i]){
        	}
        	else{
        		m++;
        	}
        }
        System.out.println(m==0?"Yes":"No");
        
    }
}