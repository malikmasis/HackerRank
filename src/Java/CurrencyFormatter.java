package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-currency-formatter
public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = formatter.format(payment);
        
        NumberFormat formatterFr = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String france = formatterFr.format(payment);
        
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatterIndia.format(payment);
        
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = formatterChina.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}