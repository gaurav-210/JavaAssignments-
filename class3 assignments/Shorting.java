package class3_Assignments;

public class Shorting {

	
	public static void main(String args[]){
		
	     int arr[]={1,1,1,1,0,0,1,0,1,0,0,1,0};
	  int length=arr.length;
	  
	     for(int i=1;i<length;i++){
	        int ele=arr[i];
	         int j=i-1;
	         
	     while(j>=0 && arr[j]>ele) {
	             arr[j+1]=arr[j];
	             j=j-1;
	         }
	         arr[j+1]=ele;
	     }
	     for(int i=0;i<length;i++)
	         System.out.print(" "+arr[i]);
	     
	     
	 }
}














