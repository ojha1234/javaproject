// Write a Java Program to remove all the white spaces from a string.

public class removalofwhitespacefrstring 
{
     public static void main(String[] args)
    {
        String str = "  work    harder    than   everyone.......    ";
 
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
    
}
