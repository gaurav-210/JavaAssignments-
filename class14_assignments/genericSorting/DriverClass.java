package GenericSorting;

//copyrigt@gauravchauhan

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


public class DriverClass{
    
    public static void main(String args[]) throws NoSuchMethodException{
       
       
        
         ArrayList <GenericSorting> list2=new ArrayList<>();
        //for strings
        
             
        GenericSorting obj2=new GenericSorting(56);
        int b=obj2.ReturnTypeFinder();
        list2.add(obj2);
        list2.add(new GenericSorting(23));
        list2.add(new GenericSorting(10));
        list2.add(new GenericSorting(900));
        
         System.out.println("Before Sorting Integers ");
            for(GenericSorting i:list2)
                System.out.println(""+i.getElement());
        
         System.out.println("After Sorting Integers ");
       
            System.out.println(" "+b);
            if(b==0)
            Collections.sort(list2, new CustomComparator());//for all other types
            else        
            Collections.sort(list2, new CustomComparator2());//for integers
             for(GenericSorting i:list2)
            System.out.println(""+i.getElement());
    }
    
}
