package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
