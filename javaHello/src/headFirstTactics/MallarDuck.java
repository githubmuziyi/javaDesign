package headFirstTactics;

/**
 * Created by muzi on 2017/6/7.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.print("I am a mallarduck!");
    }
}
