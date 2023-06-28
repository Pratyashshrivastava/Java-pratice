package basics;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // always write this when taking input
        System.out.print("Input your name: ");
        // int age = sc.nextInt();
        // System.out.println(age);
        // input string:
        String name = sc.next();
        System.out.println(name);
        String name2 = sc.nextLine();
        System.out.println(name2);
    }
}
