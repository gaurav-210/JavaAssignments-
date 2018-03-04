package class3_Assignments;

public class Reverse {

	 public static void main(String[] args) {
			int num=Integer.parseInt(args[0]);
			int newnum=0,r;
			 for(;num>0;num=num/10) 
			 {
				 r=num%10;                       
				 newnum=newnum*10+r;
				 }
			System.out.println(newnum+" IS REVERSE OF GIVEN NUMBER.");
		 }
}







