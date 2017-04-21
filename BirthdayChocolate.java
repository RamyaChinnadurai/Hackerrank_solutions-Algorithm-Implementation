import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0; j<m ; j++){
                if(i+j<n){
                    sum += s[i+j];
                }
                else{
                    break;
                }
            }
            if(sum==d){
                    count++;
                }
        }
        System.out.println(count);
        
    }
}
