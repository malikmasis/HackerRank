package Java;
    import java.util.Scanner;
    //https://www.hackerrank.com/challenges/java-if-else
    public class IfElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
            
               if(n>2 && n<5){
                   ans = "Not Weird";
               }
               else if(n>5 && n<21){
                   ans = "Weird";
               }
                else{
                     ans = "Not Weird";
                }
                
            }
            System.out.println(ans);
            
        }
    }
