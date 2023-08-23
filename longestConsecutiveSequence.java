import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int maxN = 1;
        int count = 1;
        Arrays.sort(arr);
        for(int i = 0;i < N-1 ; i++){
            if(i+1 < N && arr[i] == arr[i+1]) continue;
            if(arr[i+1] == arr[i]+1){
                count += 1;
                maxN = Math.max(count, maxN);
            }else{
                count = 1;
            }
        }
        return maxN;
    }
}
