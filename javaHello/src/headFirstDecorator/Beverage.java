package headFirstDecorator;

/**
 * Created by muzi on 2017/6/12.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";
    int size;
    int TALL = 1;
    int GRANDE = 2;
    int VENTI = 3;

    public String getDescription() {
        return description;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract double cost();
}
