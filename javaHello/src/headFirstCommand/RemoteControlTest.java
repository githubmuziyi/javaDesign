package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class RemoteControlTest {

    public static void main(String args[]) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
