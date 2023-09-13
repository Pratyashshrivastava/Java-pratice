package codes;

public class binnaryPalindrome {
    static boolean check(int a){
        String bin = Integer.toBinaryString(a);

        int i= 0, j= (bin.length() -1);
        while (i<j){
            if (bin.charAt(i) != bin.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

        }
    
    public static void main(String[] args){
        int a = 45;
        System.out.print(check(a));
    }
}
