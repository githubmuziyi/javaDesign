package headFirstSingleton;

/**
 * Created by muzi on 2017/6/14.
 */
public class SingletonLocking {

    private volatile static SingletonLocking uniqueInstance;

    private SingletonLocking() {}

    //双重检验加锁 只有在单例不存在是才会同步
    public static SingletonLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
