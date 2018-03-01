package class3_Assignments;

public class Armstrong {
	
public static void main(String[] args){
        
        int num=Integer.parseInt(args[0]);
        int sum=0,a;
        int copy=num;
        
        while(num!=0){
            a=num%10;
            num=num/10;
            
            sum=sum+a*a*a;
            
        }
        num=copy;
        
        if(sum==copy)
            System.out.println(num+" is an Armstrong Number");
            else
            System.out.println("Not an Armstrong Number !");
        
        
        
    }

}













