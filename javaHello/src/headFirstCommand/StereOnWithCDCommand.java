package headFirstCommand;

import java.security.PublicKey;

/**
 * Created by muzi on 2017/6/15.
 */
public class StereOnWithCDCommand implements Command {
    Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
