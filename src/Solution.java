class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] nums={1,2,6,5};
        int target=7;
        int[] output=new int[2];

        Solution s=new Solution();
        output=s.twoSum(nums,target);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }
}