import java.util.*;


public class Solution {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < length; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = length-1;
                while(k < l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        List<Integer> subList = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        list.add(subList);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return list;
    }
}
