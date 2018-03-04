package class3_Assignments;

public class searching {

	 public static void main(String[] args) {
  	   int num =Integer.parseInt(args[0]);
  	   int B[] = {1,4,6,7,8,9,10};
  	   byte flag=0;
             for(int n:B) {
          	   if(n==num){System.out.println("Number "+num+" Found!");
          	   flag=1; break;
          	      }
               }
             if(flag==0) System.out.println("Number "+num+" doesn't Exist.");
	}

}














    

