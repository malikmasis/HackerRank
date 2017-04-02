package Java;
import java.util.Scanner;

public class OutputFormatting {
	//https://www.hackerrank.com/challenges/java-output-formatting
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
            	//String a= sc.next();
                String s1=sc.next();
                int x=sc.nextInt();
                while(s1.length()<15){
                    s1+=" ";
                    //System.out.print(s1);
                }
                if(x>99){
               	 System.out.print(s1);
                   System.out.println(x);
               }
                if(x>9 && x<100){
                	System.out.print(s1);
                    System.out.println("0"+x);
                }
                 if(x<10){
                	 System.out.print(s1);
                    System.out.println("00"+x);
                }
                 
            }
            System.out.println("================================");

    }
}