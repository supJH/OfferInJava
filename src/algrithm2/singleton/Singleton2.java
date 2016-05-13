package algrithm2.singleton;

/**
 * Created by Administrator on 2016/4/25.
 */
public class Singleton2 {

    private Singleton2(){}

    /**
     * 使用静态内部类，使用的时候才加载静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton2 instance = new Singleton2();
    }

    public static final Singleton2 getInstance(){
        return SingletonHolder.instance;
    }


}
