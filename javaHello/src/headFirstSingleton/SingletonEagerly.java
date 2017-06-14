package headFirstSingleton;

/**
 * Created by muzi on 2017/6/14.
 */
public class SingletonEagerly {

    private static SingletonEagerly uniqueInsurance = new SingletonEagerly();

    private SingletonEagerly() {}

    //饿汉式代码，初始化时创建单例，保证了线程安全，可能存在不需要用到该单例却生成了的情况
    public static SingletonEagerly getInsurance() {
        return uniqueInsurance;
    }
}
