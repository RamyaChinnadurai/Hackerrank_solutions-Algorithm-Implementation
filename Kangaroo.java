import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        float temp = 0;
        temp = (float)(x2-x1)/(float)(v1-v2);
        if(temp %1 == 0 && temp>=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
