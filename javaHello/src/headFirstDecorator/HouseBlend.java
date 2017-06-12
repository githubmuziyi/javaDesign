package headFirstDecorator;

/**
 * Created by muzi on 2017/6/12.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 7.5;
    }
}
