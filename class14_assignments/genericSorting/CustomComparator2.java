package GenericSorting;

//copyrigt@gauravchauhan

import java.util.Comparator;
import java.util.Objects;


public class CustomComparator2 implements Comparator<GenericSorting>{
//for integer sorting
    @Override
    public int compare(GenericSorting t,GenericSorting t1) {
        
        Integer a=(Integer)t.getElement();
        Integer b=(Integer)t1.getElement();
        
          if(Objects.equals(a, b))  
            return 0;  
            else if(a>b)  
            return 1;  
            else  
            return -1;  
             
       
    }
}