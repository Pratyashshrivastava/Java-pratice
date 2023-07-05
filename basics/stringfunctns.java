package basics;
public class stringfunctns{
    public static void main(String[] args) {
        String name = "Pratyash";
        System.out.println(name.charAt(5));
        System.out.println(name.length());
        // replace:
        String name2 = name.replace('a','b');
        System.out.println(name2);
        System.out.println(name);
        // Substring
        String name3 = "Pratyash and Meghana";
        System.out.println(name3.substring(13, 20));
    }
}