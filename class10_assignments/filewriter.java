import java.io.FileWriter;  
public class filewriter {
     
	public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("D:\\\\java assignments\\\\class10_assignments\\filewriter.txt");    
	           fw.write("Three c's in life : \n Choice , Chances n Changes \n "
	           		+ " You must make a choice to take a chance or your life will never change."
	           		+ "\n To make a difference in someone's life you don't have 2 be brilliant,"
	           		+ " rich or perfect, you just have to care. ");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     } 
}
