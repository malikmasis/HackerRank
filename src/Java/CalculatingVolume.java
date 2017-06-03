package Java;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/calculating-volume/submissions/code/37353766
class Volume{
	
	public static double get_volume(int a) {
		return a * a * a;
	}
	public static double get_volume(int a,int b,int c) {
		return a * b * c;
	}
	
	public static double get_volume(double a) {
		return (2 * Math.PI * a * a * a) / 3;
	}
	public static double get_volume(double a,double b) {
		return Math.PI * (a * a) * b;
	}
	
}

class Output{
	public void display(Double val){
		System.out.printf("%.3f", val);
        System.out.println();
	}
}
class Calculate {

	Scanner sc = new Scanner (System.in);
	Output output = new Output();
	
	public int get_int_val() throws IOException {
		
		int a = sc.nextInt();
		if(a>0)
		return a;
		else
		throw new NumberFormatException("All the values must be positive");
	}

	public double get_double_val()throws IOException {
		double a = sc.nextDouble();
		if(a>0)
		return a;
		else
		throw new NumberFormatException("All the values must be positive");
	}
	
	
	public static Volume do_calc() {
		
		return new Volume();
	}
	
	public static Output display(){
		return new Output();
	}
}


public class CalculatingVolume {

	 public static void main(String[] args) {
	   DoNotTerminate.forbidExit();
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (IOException e) {
	    e.printStackTrace();
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution

	
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {}

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	} //end of Do_Not_Terminate

