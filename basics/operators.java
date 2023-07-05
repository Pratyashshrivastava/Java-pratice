package basics;
public class operators {
    public static void main(String[] args) {
        // 1) Arithmatic operators: (+,-,*, /, %)
        int a = 1;
        int b = 2;
        int sum = a+b;
        System.out.println(sum);

        // 2) Assignment operators: (=, ++, --)
        int num = 1;
        System.out.println(num++); // Returns: 1, as it will change the num value after this line
        System.out.println(num); //Returns: 2, as the num value changed in the previous line
        System.out.println(++num); //Return: 3, as the value change in this line only and returns the updated value
        
    }
}
