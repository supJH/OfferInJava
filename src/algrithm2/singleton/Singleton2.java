package algrithm2.singleton;

/**
 * Created by Administrator on 2016/4/25.
 */
public class Singleton2 {

    private Singleton2(){}

    /**
     * ʹ�þ�̬�ڲ��࣬ʹ�õ�ʱ��ż��ؾ�̬�ڲ���
     */
    private static class SingletonHolder{
        private static final Singleton2 instance = new Singleton2();
    }

    public static final Singleton2 getInstance(){
        return SingletonHolder.instance;
    }


}
