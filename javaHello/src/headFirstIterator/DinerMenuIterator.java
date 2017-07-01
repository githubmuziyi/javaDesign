package headFirstIterator;

/**
 * Created by muzi on 2017/7/1.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        //因为使用的是固定长度的数组，所以我们不但要检查是否超出了数组长度，也必须检查是否下一项是null，如果是null就表示没有下一项了
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
