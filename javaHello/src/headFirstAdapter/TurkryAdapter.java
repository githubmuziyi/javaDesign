package headFirstAdapter;

/**
 * Created by muzi on 2017/6/20.
 */
public class TurkryAdapter implements Duck {

    Turkey turkey;

    public TurkryAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}