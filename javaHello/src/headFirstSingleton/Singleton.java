package headFirstSingleton;

/**
 * Created by muzi on 2017/6/14.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    //加入synchronized关键字，迫使每个线程进入方法前需要先等候其他线程离开，防止多线程的问题，但是会造成性能问题，每次调用都需要检查
    public static synchronized Singleton getInstance() {
        if ( uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
