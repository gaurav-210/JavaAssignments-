package class8_assignments;

import java.util.Scanner;


public class String2IntMax {

	 public static void main(String args[]){

		  System.out.println("Enter the first number");
		  Scanner scan = new Scanner(System.in);
		  String str1=scan.next();


		  System.out.println("Enter the second number");
		  String str2=scan.next();

		  if(Integer.parseInt(str1)>Integer.parseInt(str2))
		       System.out.println(""+str1+" is the largest number");
		  else
		      System.out.println(""+str2+" is the largest number");
		  

		  }

}





