package headFirstIterator;

import java.util.ArrayList;

/**
 * Created by muzi on 2017/7/1.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Regular of the day", "Regular of the day,with a side of potato salad", false, 5.36);
        //继续加入其它项目
    }

    public void addItem(String name, String description, boolean vagetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vagetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
