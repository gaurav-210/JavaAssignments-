package GenericSorting;

//copyrigt@gauravchauhan

import java.lang.reflect.Method;
import java.util.Comparator;

public class GenericSorting <T>{
    
    private T element;
    
     public GenericSorting() {
         System.out.println(" ");
    }

    public GenericSorting(T element) {
        this.element=element;
    }
    
    public T getElement(){
        
        return element;
    }
    
    public int ReturnTypeFinder(){
       T obj= this.getElement();
        
        if(obj instanceof Integer)
            return 1;
        else
            return 0;
    }
    
   
   
    
}


    

    
    
    

