package headFirstTactics;

/**
 * Created by muzi on 2017/6/7.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("quack!");
    }
}
