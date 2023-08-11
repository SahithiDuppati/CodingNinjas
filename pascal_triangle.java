import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) {

        int[][] triangle = new int[N][];
        for(int i = 0; i < N; i++){
            triangle[i] = new int[i+1];
            for(int j = 0 ;j <= i; j++){
                triangle[i][j] = 1;
            }
        }

        for(int i = 2; i < N; i++){
            for(int j = 1; j < i; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }
}
