package headFirstCombination;

import java.util.Iterator;

/**
 * Created by muzi on 2017/7/5.
 */
public class NullIterator implements Iterator {

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
