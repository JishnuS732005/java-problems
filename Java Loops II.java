#  https://www.hackerrank.com/challenges/java-loops/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
            int currentValue = a;
            for(int j=0;j<n;j++) {
                currentValue += b*(1<<j);
                System.out.print(currentValue+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
