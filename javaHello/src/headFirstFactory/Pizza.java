package headFirstFactory;

import java.util.ArrayList;

/**
 * Created by muzi on 2017/6/13.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauth;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauth ...");
        System.out.println("Adding toppings :");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    public void box() {
        System.out.println("Place pizza in offical pizzastore box");
    }

    public String getName() {
        return name;
    }
}
