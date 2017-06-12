package headFirstTactics;

/**
 * Created by muzi on 2017/6/7.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    //默认飞行
    public void performFly() {
        flyBehavior.fly();
    }

    //默认叫声
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.print("all duck can swim!");
    }

    //设置飞行行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    //设置叫行为
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
