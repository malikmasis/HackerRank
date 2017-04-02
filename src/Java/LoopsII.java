package Java;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-loops
public class  LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int result=0;
        int t=in.nextInt();
        for(int i=1;i<=t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int p=0;
            while(p<n){
            	result = 0;
            	int aa=0;
                  for(int k= 0 ; k<=p ; k++){
                	  //System.out.println("p:"+p);
            	  result=(int) ((Math.pow(2,k))*b);
            	  aa += result;
            	 // System.out.println("result for:"+(result));
            	  }
                p++;
                System.out.print((a+aa)+" ");
                
            }
            System.out.println();
            
        }
        in.close();
    }
}