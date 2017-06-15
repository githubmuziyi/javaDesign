package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class Light {

    String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " Light is On");
    }

    public void off() {
        System.out.println(type + " Light is Off");
    }
}
