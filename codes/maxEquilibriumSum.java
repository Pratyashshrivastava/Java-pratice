package codes;

import java.util.Scanner;

public class maxEquilibriumSum {
    static int maxSum(int[] arr){
        int res = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i=0;i<n;i++){
            int perfixSum = arr[i];
            for(int j = 0; j<i; j++){
                perfixSum+=arr[j];
            }
            int suffixSum = arr[i];
            for(int j = n-1; j>i; j--){
                suffixSum+=arr[j];
            }
            if (perfixSum == suffixSum){
                res = Math.max(res, perfixSum);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
    }
}
