class Solution {
    public int[] twoSum(int[] nums, int target) {
int l=0,k=0;

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (i==j) continue;
                if (nums[i]+nums[j]==target){
                    l=i;
                    k=j;
                }
            }
        }
        
    return new int []{k,l};
}
}