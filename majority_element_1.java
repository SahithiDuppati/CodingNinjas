import java.util.HashMap;

public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < v.length; i++){
            if(map.containsKey(v[i])){
                map.put(v[i], map.get(v[i])+1);
                if(map.get(v[i]) > v.length/2){
                    return v[i];
                }
            }else{
                map.put(v[i], 1);
            }
        }
        return v[0];

    }
}
