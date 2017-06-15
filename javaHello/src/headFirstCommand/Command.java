package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public interface Command {

    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
