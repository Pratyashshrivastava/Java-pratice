package codes;

public class euclidsAlgo {
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }

        return gcd(b%a, a);
    }
    public static void main(String[] args){
        int a = 10, b = 15;
        System.out.println(gcd(a,b));
    }
}
