package headFirstObserver;

/**
 * Created by muzi on 2017/6/8.
 */
public interface Subject {

    /**
     * 订阅
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 取消订阅
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知订阅者
     */
    public void notifyObservers();
}
