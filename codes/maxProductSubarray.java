package codes;
import java.util.*;
public class maxProductSubarray {

    static int maxProdSub(int arr[]){
        int result = arr[0];
        int n = arr.length;
        for( int i = 0; i<n; i++){
            int mul = arr[i];
            for (int j = i+1; j<n; j++){
                result = Math.max(result, mul);
                mul= mul*arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] = { 1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Priodukjbkad: " + maxProdSub(arr));
    }
}
