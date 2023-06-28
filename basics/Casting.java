package basics;
public class Casting {
    public static void main(String[] args){
        //Casting: casting one datatype into another
        // 1) Implicit type casting:
        double price = 100.00;
        double finalPrice = price+18;
        System.out.println(finalPrice);
        // 2) explicit type casting::
        int p = 100;
        // int fP = p + 18.0; //Error
        int fP1 = p + (int)18.0;  // It will give fP = 118
        int fP2 = p + (int)18.18; // It will also give fP = 118

        // Constants:
        int age = 19;
        age = 20;

        final float Pi = 3.14F;
        Pi = 3.14F;
        System.out.println(Pi);
    }
}
