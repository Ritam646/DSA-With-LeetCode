class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int start = 1;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[start-1]){
                start++;
                nums[start] = nums[i];
            }
        }
        return start+1;
    }
}