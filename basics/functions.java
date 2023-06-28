package basics;

public class functions {
    public static void printJava(){
        System.out.println("Hello Java");
    }
    public static String printName(String name){
        return name;
    }
    public static void main(String[] args) {
        for(int i =1; i<4;i++)
            System.out.println(printName("kush"));
    }
}
