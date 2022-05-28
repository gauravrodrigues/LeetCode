class Solution {
    public int countKDifference(int[] nums, int k) {
       int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
          int calc = (nums[i]-nums[j]) < 0 ? (nums[i]-nums[j]) * -1 : nums[i]-nums[j];
                if(calc == k){
                    count = count+1;
                }
            }
        }
        return count;
    }
}
