package headFirstTactics;

/**
 * Created by muzi on 2017/6/7.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I can not flying!");
    }
}
