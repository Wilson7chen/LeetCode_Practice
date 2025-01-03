public class Jump_Game_45 {
    public static int jump(int[] nums) {
        int jump = 0;
        int max = 0;
        int range = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(max < i + nums[i]) {
                max = i + nums[i];
            }
            if(i == range) {
                range = max;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4}; // 2
//        int[] nums = {2,3,0,1,4}; // 2
        System.out.println(jump(nums));
    }
}