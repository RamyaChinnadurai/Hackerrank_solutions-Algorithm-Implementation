import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int i=0;i<n;i++){
            score[i]=in.nextInt();
        }
        int max = score[0];
        int min = score[0];
        int maxCount = 0;
        int minCount = 0;
        for(int i=1;i<n;i++){
            if(score[i]>max){
                max = score[i];
                maxCount++;
            }
            else if(score[i]<min){
                min = score[i];
                minCount++;
            }
        }
        System.out.print(maxCount+" "+minCount);
    }
}
