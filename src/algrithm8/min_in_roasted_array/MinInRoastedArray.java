package algrithm8.min_in_roasted_array;

/**
 * Created by Administrator on 2016/4/28.
 */
public class MinInRoastedArray {

    public static void main(String[] args) {
        MinInRoastedArray m = new MinInRoastedArray();
        int result = m.min(new int[]{1,2,3,4,5});
        System.out.println(result);
    }


    public int min(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        if (nums.length == 1) return nums[0];

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        if (nums[start] < nums[end]) return nums[start];

        while (end - start != 1) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[start]) {
                start = mid;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            }
            //  {1,0,1,1,1}这种情形只能用顺序查询了
            if (nums[start] == nums[mid] && nums[mid] == nums[end])
                return minInOrder(nums);
        }
        return nums[mid];

    }


    public int minInOrder(int[] nums) {
        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minNum) minNum = nums[i];
        }
        return minNum;
    }

}
