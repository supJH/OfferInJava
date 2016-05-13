package algrithm10.OneNumsInBinary;

/**
 * Created by Administrator on 2016/4/28.
 */
public class OneNumsInBinary {
    public static void main(String[] args) {
        OneNumsInBinary o = new OneNumsInBinary();
        System.out.println(o.oneNumsInBinary(-1));

    }


    public int oneNumsInBinary(int num) {
        int i = 0;
        while (num != 0) {
            num = num & (num - 1);
            i++;
        }
        return i;

    }

}
