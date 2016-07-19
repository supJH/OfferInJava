package algrithm03.array_search;

/**
 * Created by Administrator on 2016/4/25.
 */

/**
 * 二维有序数组查找
 * 每行从左到右递增
 * 每列从上到下递增
 */
public class ArraySearch {

    public static void main(String[] args) {
        ArraySearch a = new ArraySearch();
        int[][] nums = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        System.out.println(a.find(nums, 1));
    }

    public boolean find(int[][] nums, int target) {
        boolean isFind = false;
        int j = nums.length - 1;
        int i = 0;
        while (i < nums[0].length && j >= 0) {
            if (nums[j][i] > target) {
                j--;
            } else if (nums[j][i] < target) {
                i++;
            } else {
                isFind = true;
                break;
            }
        }
        return isFind;
    }

}
