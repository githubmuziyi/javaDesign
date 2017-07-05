package headFirstIterator;

import java.util.ArrayList;

/**
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
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
