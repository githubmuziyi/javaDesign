package headFirstFactory;

/**
 * Created by muzi on 2017/6/13.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("other")) {
            //otherPizza
            return new NYStyleCheesePizza();
        } else return null;
    }
}
