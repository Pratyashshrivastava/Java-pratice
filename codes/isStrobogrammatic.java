package codes;
import java.util.HashMap;
import java.util.Map;

public class isStrobogrammatic {
    public static boolean isStrobogrammatic(String num){
        Map<Integer, Integer> strobogrammaticDictionary = new HashMap<>();
        strobogrammaticDictionary.put(0,0);
        strobogrammaticDictionary.put(1,1);
        strobogrammaticDictionary.put(6,9);
        strobogrammaticDictionary.put(8,8);
        strobogrammaticDictionary.put(9,6);
        
        int n = num.length();
        for(int i=0, j = (n-1); i<=j; i++, j--){
            int digit_left = num.charAt(i) - '0';
            int digit_right = num.charAt(j) - '0';

            int mapping = strobogrammaticDictionary.getOrDefault(digit_left, -1);
            if(mapping == -1){
                return false;
            }
            if (mapping != digit_right){
                return false;
            }
        }
    return true;
    }
    public static void main(String args[]){
        System.out.println(isStrobogrammatic("420"));

    }
}
