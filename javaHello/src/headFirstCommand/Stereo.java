package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class Stereo {

    String type;

    public Stereo(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " Stereo is On");
    }

    public void off() {
        System.out.println(type + " Stereo is Off");
    }

    public void setCD() {
        System.out.println(type + " Stereo is setCD");
    }

    public void setVolume(int volume) {
        System.out.println(type + " Stereo is setVolume " + volume);
    }
}
