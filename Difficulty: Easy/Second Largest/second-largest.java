//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
      
              for (int num : arr) {
        if (num > largest) {
            sLargest = largest;
            largest = num;
        } else if (num > sLargest && num < largest) {
            sLargest = num;
        }
    }
          if (sLargest == Integer.MIN_VALUE) {
        return -1;
    }
        
        return sLargest;
    }
}

