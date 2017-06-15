package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
