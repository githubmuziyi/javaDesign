package headFirstAdapter;

/**
 * Created by muzi on 2017/6/20.
 */
public class DuckTestDrive {

    public static void main(String args[]) {
        MallarDuck mallarDuck = new MallarDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkryAdapter(wildTurkey);

        System.out.println("The wildTurkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
