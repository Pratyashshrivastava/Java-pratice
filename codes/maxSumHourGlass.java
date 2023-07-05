package codes;

import java.util.Scanner;

public class maxSumHourGlass {
    static int maxsumhourglass(int[][] arr1, int r, int c){
        int maxsum = Integer.MIN_VALUE;
        if(r<3||c<3){
            System.out.println("not possible");
            System.exit(0);
        }
        for (int)
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr1 = new int[r][c];
        for( int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int res = maxsumhourglass(arr1, r,c);
        System.out.println(res);
    }
}
