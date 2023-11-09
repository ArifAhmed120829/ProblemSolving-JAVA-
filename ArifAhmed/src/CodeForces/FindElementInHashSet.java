package codeforce;

import java.util.*;


public class FindElementInHashSet {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i =0; i<t; i++){
            int n,k;
            n = in.nextInt();
            k = in.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for(int j =0; j<n; j++){
               arr[j] = in.nextInt();
               set.add(arr[j]);
            }
            // Check if an element exists in the HashSet
            
            if (set.contains(k)) {
            	System.out.println("YES");
            }
            else {
            	System.out.println("NO");
            }
           
            
        }
        

       

      
    }
}


