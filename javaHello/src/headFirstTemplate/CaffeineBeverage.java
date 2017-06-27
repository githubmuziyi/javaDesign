package headFirstTemplate;

/**
 * Created by muzi on 2017/6/27.
 */
public abstract class CaffeineBeverage {

    /**
     * 模板方法模式：
     * 在一个方法中定义一个算法框架，而将一些步骤延迟到子类中，模板方法使得步骤可以在不改变算法结构的情况下，重新定义算法中的某些步骤
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //顾客想加调料是才加调料
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * hook 钩子函数：子类可以自行决定是否覆盖它
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
