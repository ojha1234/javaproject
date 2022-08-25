
package stringarrayproject;
import java.util.Arrays;

public class arraytable 
{
    public void display(int x[],String s[])
    {
        Arrays.sort(x);
        Arrays.sort(s);
        System.out.println("Name\tvalue");
        for(int i= 0;i<x.length;i++)
        {
            System.out.println(s[i]+"\t"+x[i]);
            
        }
    }
    public static void main(String[] args) {
        String[]name ={" peter","amy","john","boyd","cathy"};
        int[]values = {15,9,14,10,12};
        arraytable t = new arraytable();
        t.display(values,name );
    }
    
}
