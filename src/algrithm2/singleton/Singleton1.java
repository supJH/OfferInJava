package algrithm2.singleton;

/**
 * Created by Administrator on 2016/4/25.
 */


/**
 * ˫�������
 * �̰߳�ȫ��
 */
public class Singleton1 {

    /**
     *singleton = new Singleton()��䣬�Ⲣ����һ��ԭ�Ӳ�������ʵ���� JVM ����仰����������� 3 �����顣

     �� singleton �����ڴ�
     ���� Singleton �Ĺ��캯������ʼ����Ա�������γ�ʵ��
     ��singleton����ָ�������ڴ�ռ䣨ִ�����ⲽ singleton���Ƿ� null �ˣ�
     ������ JVM �ļ�ʱ�������д���ָ����������Ż���Ҳ����˵����ĵڶ����͵�������˳���ǲ��ܱ�֤�ģ�
     ���յ�ִ��˳������� 1-2-3 Ҳ������ 1-3-2������Ǻ��ߣ����� 3 ִ����ϡ�2 δִ��֮ǰ�����̶߳���ռ�ˣ�
     ��ʱ instance �Ѿ��Ƿ� null �ˣ���ȴû�г�ʼ�����������̶߳���ֱ�ӷ��� instance��
     Ȼ��ʹ�ã�Ȼ��˳����µر���

     ��ָֹ�������Ż�
     */
    private volatile static Singleton1 instance = null;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(instance == null){
            synchronized (Singleton1.class){
                if (instance == null){
                     instance = new Singleton1();
                }
            }
        }
        return  instance;
    }

}
