import java.io.File;
import java.io.IOException;

public class createFile {

	  public static void main(String[] args) {
	      try {
	         File file = new File("D:\\java assignments\\class10_assignments\\Create.txt");
	         
	         if(file.createNewFile())System.out.println("Success!");
	         else System.out.println ("Error, file already exists.");
	      }
	      catch(IOException ioe) {
	         ioe.printStackTrace();
	      }
	   }

}











        
        
        
        
  