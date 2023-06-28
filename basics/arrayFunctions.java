package basics;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class arrayFunctions {
    public static void main(String[] args){
        int age = 30;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 92;
        marks[2]= 99;
        // for(int i=0; i<3; i++){
        //     marks[i] = 99;
        // }
        //length:
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // If we already know what are the values we want to put in arrays the this is how we initialise the array:
        int [] marks2 = {97,98,99};

        // 2D arrays:
        int [] [] finalMarks = {{97,98,99}, {95,94,91}};
        System.out.println(finalMarks[1][0]);
    }
    
}
