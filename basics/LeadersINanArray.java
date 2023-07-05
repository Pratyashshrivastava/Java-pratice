package basics;
import java.util.*;
public class LeadersINanArray {
    static void leadArray(int arr[], int n){
        int curr_arr = arr[n-1];
        System.out.println(curr_arr);
        for(int i = n-2; i>=0;i--){
            if (arr[i]>curr_arr){
                curr_arr = arr[i];
                System.out.println(curr_arr);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        leadArray(arr,n);
    }
}
