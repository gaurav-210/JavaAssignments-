import java.io.*;  
public class write {

	
	
	    public static void main(String[] args) {  
	        try {  
	            Writer w = new FileWriter("D:\\java assignments\\class10_assignments\\Create.txt");  
	            String content = "Hi!! \n I'm Gaurav Chauhan \n Currently i'm pursuing my second year Bachelor of Technology in Electronics and Communication Engineering. ";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}  



