package codes;

import java.util.*;

public class maxSumHourGlass{
    static int R = 5;
    static int C = 5;

    static int maxSumHourglass(int [][]mat){
        if (R<3 || C<3){
            System.out.println("not possible");
            System.exit(0);
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; (i< R-2); i++){
            for (int j = 0; j<C-2;j++){
                int sum = (mat[i][j]+mat[i][j+1]+mat[i][j+2]+
                mat[i+1][j+1]+ mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
                maxSum = Math.max(maxSum, sum);
            }

        }
        return maxSum;
    }
    public static void main(String [] args){
        int [][]mat = {{1,2,3,0,0},
                       {0,0,0,0,0},
                       {2,1,4,0,0},
                       {0,0,0,0,0},
                       {1,1,0,1,0}};
        int res = maxSumHourglass(mat);
        System.out.println(res);

    }
}