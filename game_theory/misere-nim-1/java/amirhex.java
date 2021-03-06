import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            boolean allOne = true;
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
                sum ^= arr[i];
                if(arr[i] != 1)
                    allOne = false;
            }
            
            if(allOne){
                if(n % 2 == 0){
                    System.out.println("First");
                }
                else
                    System.out.println("Second");
            }
            else{
                if(sum == 0){
                    System.out.println("Second");
                }
                else
                    System.out.println("First");
            }
            
            T--;
        }
    }
}