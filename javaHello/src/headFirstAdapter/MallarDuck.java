package headFirstAdapter;

/**
 * Created by muzi on 2017/6/20.
 */
public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
