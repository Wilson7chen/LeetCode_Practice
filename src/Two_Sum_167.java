import java.util.Arrays;

public class Two_Sum_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(numbers[i] + numbers[j] != target) {
            if(numbers[i] + numbers[j] < target) {
                i++;
            } else if(numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return new int[] {i + 1,j + 1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9; // [1,2]

//        int[] nums = {2,3,4};
//        int target = 6; // [1,3]

//        int[] nums = {-1,0};
//        int target = -1; // [1,2]

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}