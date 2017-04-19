import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int grades_i=0; grades_i < n; grades_i++){
            int grade = in.nextInt();
            if(grade>=38 && grade%5>=3){
                grade = 5 *(grade/5 +1);
            }else{
                grade = grade;
            }
            System.out.println(grade);
        }
        
    }
}
