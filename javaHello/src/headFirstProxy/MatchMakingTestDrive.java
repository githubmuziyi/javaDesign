package headFirstProxy;

import java.lang.reflect.Proxy;

/**
 * Created by muzi on 2017/7/13.
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    public MatchMakingTestDrive() {}

    public void drive() {
        PersonBean ownerProxy = getOwnerProxy(new PersonBeanImpl());
        ownerProxy.getName();
        ownerProxy.setInterests("bowling ,Go");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(new PersonBeanImpl());
        nonOwnerProxy.getName();
        nonOwnerProxy.setHotOrNotRating(10);
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );
    }
}
