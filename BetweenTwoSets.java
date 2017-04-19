import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
    
        int min = a[n-1];
        int max = b[0];
        int count =0;
        for(int i = min;i<=max;i++){
           boolean flag = true;
              for(int j=0;j<n;j++){
                 if(i%a[j]!=0){
                    flag = false;
                    break;
                 }                   
             }
         if(flag)
             for(int k=0;k<m;k++){
                if(b[k]%i!=0){
                flag = false;
                break;
            }
        }
        if(flag)
            count++;
        }
        System.out.println(count);
    }
}
