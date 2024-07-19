#  https://www.hackerrank.com/challenges/java-strings-introduction/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.nextLine().trim();
        String B = sc.nextLine().trim();
        int lengthSum = A.length()+B.length();
        System.out.println(lengthSum);
        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capitalizedA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalizedA+" "+capitalizedB);
        sc.close();
    }
}
