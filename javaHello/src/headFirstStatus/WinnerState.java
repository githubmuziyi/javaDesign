package headFirstStatus;

/**
 * Created by muzi on 2017/7/10.
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You arr winner,no insertQuarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You arr winner, no ejectQuarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You arr winner, no turnCrank");
    }

    @Override
    public void dispense() {
        System.out.println("You`re a winner You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0 ) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
