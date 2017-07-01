package headFirstIterator;

import java.util.ArrayList;

/**
 * Created by muzi on 2017/7/1.
 */
public class PancakeHouseIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList items) {
        this.menuItems = items;
    }

    @Override
    public Object next() {
        Object object = menuItems.get(position);
        position = position + 1;
        return object;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }
}
