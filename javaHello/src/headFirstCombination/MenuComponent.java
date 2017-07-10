package headFirstCombination;

import java.util.Iterator;

/**
 * 菜单组件：为叶子节点和组合节点提供一个共同的接口
 * 组合模式：允许你将对象组成树形结构来表现"整体/部分"的层次结构，组合能让客户以一直的方式处理个别对象和对象组合
 * Created by muzi on 2017/7/3.
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
