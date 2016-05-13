package algrithm07.queue_with_two_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2016/4/26.
 */
public class StackWithTwoQueue {
    private Queue<Node> q1 = new LinkedList<>();
    private Queue<Node> q2 = new LinkedList<>();

    public static void main(String[] args) {
        StackWithTwoQueue s = new StackWithTwoQueue();
        s.appendTail(new Node(1));
//        s.appendTail(new Node(2));
//        s.appendTail(new Node(3));

        s.deteleTail();

        s.appendTail(new Node(4));
        s.deteleTail();

    }

    public void appendTail(Node appendNode) {
        if (!q2.isEmpty()) {
            q2.offer(appendNode);
        } else {
            q1.offer(appendNode);
        }
    }

    public void deteleTail() {
        if(!q1.isEmpty()){
            while (q1.size() > 1) {
                Node node = q1.remove();
                q2.offer(node);
            }
            if(q1.size() == 1) q1.remove();
        }else{
            while (q2.size() > 1) {
                Node node = q2.remove();
                q1.offer(node);
            }
            if(q2.size() == 1) q2.remove();
        }

    }


}
