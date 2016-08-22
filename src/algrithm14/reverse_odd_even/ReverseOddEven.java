package algrithm14.reverse_odd_even;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/5/9.
 * 调整数组的顺序，奇数位于数组的前半部分，偶数位于数组后半部分
 */
public class ReverseOddEven {

    public static void main(String[] args) {
        ReverseOddEven r = new ReverseOddEven();
        int[] nums = {1,2,3,5};
        int[] result = r.reverseOddEven(nums);

        System.out.println(Arrays.toString(result));
    }


    public int[] reverseOddEven(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
//        思想就是交换数组中前半部分中的偶数和前后部分中的奇数
        while (p1 < p2) {
            while ((nums[p1] & 1) == 1 && p1 < nums.length - 1) {
                p1++;
            }

            while ((nums[p2] & 1) == 0 && p1 < nums.length - 1) {
                p2--;
            }
            if (p1 < p2) {
                swap(nums, p1, p2);
            }
//            p1++;
//            p2--;

        }

        return nums;
    }

    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

}
