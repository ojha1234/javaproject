
package stringarrayproject;
import java.util.*;

public class stringarray 
{
     public static void main(String[] args)
     {
        String[] colorsArray = new String[5];
        // initial array values
        colorsArray[0] = "Red";
        colorsArray[1] = "Green";
        colorsArray[2] = "Blue";
        System.out.println("Original Array:" + Arrays.toString(colorsArray));
        int numberOfItems = 3;
 
        // try to add new value at the end of the array
        String newItem = "Yellow";
        colorsArray[numberOfItems++] = newItem;
        System.out.println("Array after adding one element:" +  
                  Arrays.toString(colorsArray));
    
    
}
}