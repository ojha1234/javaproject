// Write a program to find factorial of a number.
public class factorial
{
    
     public static void main(String[] args)
    {
       int i,fact=1;
       int number=5;//it si the number calculate the factorial
       for(i=1;i<=number;i++)
       {
           fact=fact*i;
       }
       System.out.println("factorial of" + number + "is:" +fact);
    }
}
