package headFirstDecorator;

/**
 * Created by muzi on 2017/6/12.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresse";
    }

    @Override
    public double cost() {
        return 10.5;
    }
}
