import java.util.Arrays;

public class Exercise {

    public int removeDuplicates(int[] nums) {

        nums= Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(nums));
        System.out.println("Array length = " +nums.length);
        return nums.length;
    }

    public int removeDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Array length = " + (i+1));
        return (i + 1);
    }
    public static void main(String[] args) {
        int[] nums =  new int[]{1, 1, 2};
        Exercise exercise = new Exercise( );
        exercise.removeDuplicates(nums);
        exercise.removeDuplicate(nums);





    }
}
