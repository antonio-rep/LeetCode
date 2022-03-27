class Solution {
    
   public static int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int soma;
        int[] result = new int[0];
        search:
        {
            for (i = 0; i < nums.length; i++) {
                for (j = 0; j < nums.length; j++) {
                    if (i != j) {
                        soma = nums[i] + nums[j];
                        if (soma == target) {
                            result = new int[]{i, j};
                            break search;
                        }
                    }
                }
            }
        }
        return result;
    }
}
