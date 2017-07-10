package headFirstStatus;

/**
 * Created by muzi on 2017/7/10.
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
