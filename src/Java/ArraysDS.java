package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/arrays-ds
public class ArraysDS {

    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int[] dizi = new int[1000] ;
	        
	        
	        for(int i = 0 ; i<a ; i++){
	        	dizi[i]=scan.nextInt();
	        }
	        for(int i = a ; i>0 ; i--){
	        	System.out.print(dizi[i-1]+" ");
	        }
	        scan.close();
    }
}