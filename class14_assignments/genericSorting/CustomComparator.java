package GenericSorting;

//copyright@gauravchauahan 

//for All other sorting
import java.util.Comparator;


public class CustomComparator implements Comparator<GenericSorting>{

    @Override
    public int compare(GenericSorting t,GenericSorting t1) {
        
            return t.toString().compareTo(t1.toString());      
       
    }
}