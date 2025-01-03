public class Jump_Game_55 {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > max) return false;
            if(i + nums[i] > max) max = i + nums[i];
            if(max >= nums.length -1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4}; // true
//        int[] nums = {3,2,1,0,4}; // false
        System.out.println(canJump(nums));
    }
}