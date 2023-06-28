package codes;
import java.util.Scanner;

public class Plaindrome {
    public static void main(String args[]){
        String a;
        String b ="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String- ");
        a = s.nextLine();
        int n = a.length();
        for(int i=n-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not a plindrome");
        }
    }
}
// ""+"1"= "1"