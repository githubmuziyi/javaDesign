package headFirstDecorator;

/**
 * Created by muzi on 2017/6/12.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        //return 0.5 + beverage.cost();
        Double cost = beverage.cost();
        if (beverage.TALL == getSize()) {
            cost += 0.5;
        } else if (beverage.GRANDE == getSize()) {
            cost += 1.0;
        } else if (beverage.VENTI == getSize()) {
            cost += 1.5;
        }
        return cost;
    }
}
