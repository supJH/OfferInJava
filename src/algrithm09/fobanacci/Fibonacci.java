package algrithm09.fobanacci;

/**
 * Created by Administrator on 2016/4/28.
 */

/**
 * 求斐波那契数列的第n项
 */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(6));

    }

    public int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;

        int pre = 1;
        int beforePre = 1;
        int index = 2;
        int fibNum = 1;
        while (++index <= n) {
            fibNum = pre + beforePre;
            beforePre = pre;
            pre = fibNum;
        }
        return fibNum;


    }


}
