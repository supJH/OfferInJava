package algrithm9.fobanacci;

/**
 * Created by Administrator on 2016/4/28.
 */

/**
 * ����ÿ����һ��������
 * <p>���ÿ�����ļ���Ϊ1,2,...,n����ô��2�ģ�n-1������������</p>
 */

public class FrogJump {

    public static void main(String[] args) {
        FrogJump f = new FrogJump();
        int i = 0;
        while(i++ < 6){
            System.out.println(f.frogJump(i));
        }

    }

    public int frogJump(int steps) {
        if (steps <= 0) return 0;

        int preBefore = 1;
        int pre = 2;

        if (steps == 1) return preBefore;
        if (steps == 2) return pre;

        int index = 2;
        int jumpSchemesNum = 2;
        while (++index <= steps) {
            jumpSchemesNum = pre + preBefore;
            preBefore = pre;
            pre = jumpSchemesNum;
        }
        return jumpSchemesNum;

    }


}
