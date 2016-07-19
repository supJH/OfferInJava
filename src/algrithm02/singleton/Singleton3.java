package algrithm02.singleton;

/**
 * Created by Administrator on 2016/4/25.
 */

/**
 * 默认枚举实例的创建是线程安全的，所以不需要担心线程安全的问题。
 * 但是在枚举中的其他任何方法的线程安全由程序员自己负责。
 * 还有防止上面的通过反射机制调用私用构造器。
 */
public enum Singleton3 {
    INSTANCE;
}
