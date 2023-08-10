import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	ArrayList<ArrayList<Integer>> modifiedMatrix = new ArrayList<>();
            for(int i = 0;i < n; i++){
                modifiedMatrix.add((ArrayList<Integer>) matrix.get(i).clone());
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < m; i++){
                list.add(0);
            }
            for(int i = 0; i < n; i++){
                for(int j = 0;j < m; j++){
                    if(matrix.get(i).get(j) == 0){
                        modifiedMatrix.set(i, list);
                        for(int k = 0; k < n; k++){
                            modifiedMatrix.get(k).set(j, 0);
                        }
                    }
                }
            }
            return modifiedMatrix;
    }
}
