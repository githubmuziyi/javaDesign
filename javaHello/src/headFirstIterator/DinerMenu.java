package headFirstIterator;

/**
 * Created by muzi on 2017/7/1.
 */
public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Soup of the day", "Soup of the day,with a side of potato salad", false, 3.29);
        //继续加入其它项目
    }

    public void addItem(String name, String description, boolean vagetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vagetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can`t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
