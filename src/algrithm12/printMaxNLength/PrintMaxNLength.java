package algrithm12.printMaxNLength;

/**
 * Created by Administrator on 2016/4/28.
 */
public class PrintMaxNLength {

    public static void main(String[] args) {
        PrintMaxNLength p = new PrintMaxNLength();
        p.printMaxNLengthNum(20);

    }

    public void printMaxNLengthNum(int length) {
        char[] nums = new char[length];
        for (int i = 0; i < length; i++) {
            nums[i] = '0';
        }

        while (!increment(nums)) {
            printNum(nums);
        }

    }


    public boolean increment(char[] nums) {
        boolean flag = false;
        int takenOver = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int nSum = nums[i] - '0' + takenOver;
            if (i == nums.length - 1) nSum++;
            if (nSum >= 10) {
                if (i == 0) {
                    flag = true;
                } else {
                    nSum = nSum - 10;
                    takenOver = 1;
                    nums[i] = (char)('0' + nSum);
                }

            } else {
                nums[i] = (char)('0' + nSum);
                break;
            }
        }
        return flag;
    }

    public void printNum(char[] nums) {
        boolean isStart = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != '0') isStart = true;
            if (isStart){
                System.out.print(nums[i]);
            }
        }
        System.out.println();
    }

}
