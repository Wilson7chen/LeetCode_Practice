public class Min_Size_Subarray_Sum_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum >= target) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if(result == Integer.MAX_VALUE) return 0;
        return result;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }
}