package algrithm07.queue_with_two_stack;

import java.util.Stack;

/**
 * Created by Administrator on 2016/4/26.
 */
public class QueueWithTwoStack {
    private Stack<Node> s1 = new Stack<>();
    private Stack<Node> s2 = new Stack<>();

    public static void main(String[] args) {
        QueueWithTwoStack q = new QueueWithTwoStack();
        q.appendTail(new Node(1));
        q.appendTail(new Node(2));
        q.appendTail(new Node(3));

        q.deleteHead();

        q.appendTail(new Node(4));
        q.deleteHead();

    }


    public void appendTail(Node node) {
        s1.push(node);
    }

    public void deleteHead() {
        if (!s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node node = s1.pop();
                s2.push(node);
            }
        }
        if (!s2.isEmpty()){
            s2.pop();
        }
    }
}
