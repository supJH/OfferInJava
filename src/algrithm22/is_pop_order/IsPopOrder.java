package algrithm22.is_pop_order;

import java.util.Stack;

/**
 * Created by Administrator on 2016/5/14.
 * 判断是否为出栈序列
 */
public class IsPopOrder {

    public static void main(String[] args) {
        IsPopOrder i = new IsPopOrder();

        int[] pushNums = {1};
        int[] popNums = {1};
        boolean result = i.isPopOrder(pushNums, popNums);
        System.out.println(result);
    }
//    思想：当出栈序列元素等于进栈栈顶元素，进栈弹出

    public boolean isPopOrder(int[] pushNums, int[] popNums) {

        if (pushNums == null || popNums == null) return false;
        Stack<Integer> dataStack = new Stack<>();
        int j = 0;

        for (int i = 0; i < pushNums.length; i++) {

            dataStack.push(pushNums[i]);
            while (!dataStack.isEmpty() && dataStack.peek() == popNums[j] && j < popNums.length) {
                dataStack.pop();
                j++;
            }
        }
        if (dataStack.isEmpty()) {
            return true;
        }
        return false;
    }

}
