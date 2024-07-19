#  https://www.hackerrank.com/challenges/java-anagrams/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if (isAnagram(a,b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
    private static boolean isAnagram(String a,String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!= b.length()){
            return false;
        }
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA,arrayB);
    }
}
