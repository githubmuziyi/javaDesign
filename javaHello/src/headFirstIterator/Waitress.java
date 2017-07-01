package headFirstIterator;

import com.sun.xml.internal.ws.util.UtilException;

/**
 * Created by muzi on 2017/7/1.
 */
public class Waitress {

    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerIterator);
        Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
        System.out.println("\nBREAKFAST");
        printMenu(pancakeHouseIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
