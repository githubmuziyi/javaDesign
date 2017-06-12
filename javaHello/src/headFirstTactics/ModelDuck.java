package headFirstTactics;

/**
 * Created by muzi on 2017/6/8.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.print("I am model dock!");
    }
}
