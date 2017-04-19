import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple = 0; int orange = 0;
        int temp = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            temp = a + in.nextInt();
            if( temp>=s && temp<=t){
                apple++;
            }
        }
        
        for(int orange_i=0; orange_i < n; orange_i++){
            temp = b + in.nextInt();
            if(temp >=s && temp<=t){
                orange++;
            }
        }
        System.out.print(apple +"\n"+ orange);
    }
}
