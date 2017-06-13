package headFirstFactory;

/**
 * Created by muzi on 2017/6/13.
 */
public class PizzaTestDrive {

    public static void main(String args[]) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
