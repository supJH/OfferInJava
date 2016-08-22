package algrithm10.OneNumsInBinary;

/**
 * Created by Administrator on 2016/4/28.
 * 二进制中1的个数
 */
public class OneNumsInBinary {
    public static void main(String[] args) {
        OneNumsInBinary o = new OneNumsInBinary();
        System.out.println(o.oneNumsInBinary(-1));

    }


    public int oneNumsInBinary(int num) {
        int i = 0;
        while (num != 0) {
            //把最右边的1变为0
            num = num & (num - 1);
            i++;
        }
        return i;

    }

}
