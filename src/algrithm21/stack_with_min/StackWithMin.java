package algrithm21.stack_with_min;

import java.util.Stack;

/**
 * Created by Administrator on 2016/5/14.
 */
public class StackWithMin<T extends Comparable> {
    private Stack<T> dataStack;
    private Stack<T> minStack;

    public StackWithMin() {
        dataStack = new Stack<T>();
        minStack = new Stack<T>();

    }

    public void push(T t) {
        dataStack.push(t);
        if (minStack.isEmpty()) {
            minStack.push(t);
        } else {
            T minInStack = minStack.peek();
            if (t.compareTo(minInStack) < 0) {
                minStack.push(t);
            } else {
                minStack.push(minInStack);
            }
        }
    }

    public void pop() {
        if (!dataStack.isEmpty()) {
            dataStack.pop();
            minStack.pop();
        }
    }

    public T min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return null;
    }
}
