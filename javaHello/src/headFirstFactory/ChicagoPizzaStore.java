package headFirstFactory;

/**
 * Created by muzi on 2017/6/13.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("other")) {
            //otherPizza
            return new ChicagoCheesePizza();
        } else return null;
    }
}
