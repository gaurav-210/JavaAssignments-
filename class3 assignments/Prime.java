package class3_Assignments;

public class Prime {
	 public static void isprime(int num) {
         int i=2, flag=0;
         while (i<(num)){
        	 
        	 if(num%i==0) {
        		 flag=1;
        		 break;
        		 
        	 }
        	 else {
        		 flag=0;
        		 
        	 }
        	 i++;
        	
         }
         
         if(flag==0)
             System.out.println(" "+i);
    	  
      }
	   
      public static void main(String args[]){
          int j;
          int N=Integer.parseInt(args[0]);
          
         for(j=2;j<=N;j++)
              isprime(j);      
      }
}

