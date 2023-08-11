import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int zero = 0,one = 0, two = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] == 1){
                one++;
            }
            if(arr[i] == 2){
                two++;
            }
        }
        for(int i = 0; i < zero; i++){
            arr[i] = 0;
        }
        for(int i = zero; i < zero+one; i++){
            arr[i] = 1;
        }
        for(int i = zero+one; i < arr.length; i++){
            arr[i] = 2;
        }
    }
}
