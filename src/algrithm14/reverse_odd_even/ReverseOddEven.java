package algrithm14.reverse_odd_even;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/5/9.
 */
public class ReverseOddEven {

    public static void main(String[] args) {
        ReverseOddEven r = new ReverseOddEven();
        int[] nums = {1, 5, 3, 4, 2};
        int[] result = r.reverseOddEven(nums);

        System.out.println(Arrays.toString(result));
    }


    public int[] reverseOddEven(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;

        while(){
            if((nums[p1] & 1) == 1){


            }



        }


        return nums;
    }

}
