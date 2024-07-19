#  https://www.hackerrank.com/challenges/java-end-of-file/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lineNumber=1;
        while(sc.hasNext()) {
            String line=sc.nextLine();
            System.out.println(lineNumber+" "+line);
            lineNumber++;
        }
        sc.close();
    }
}
