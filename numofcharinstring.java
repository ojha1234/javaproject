//wap to count the total number of characters in a string (except space).
import java.util.Scanner;
public class numofcharinstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        System.out.println(input);
        
        String str = input;
        String[]myString = str.split(" ");
        int length = str.length();
        System.out.println(length);
    }
}
