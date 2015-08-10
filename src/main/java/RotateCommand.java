import interfaces.ICommand;
import interfaces.ITarget;

/**
 * Created by kkp on 07.08.15.
 */
public class RotateCommand implements ICommand {

    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    int dir;    

    public RotateCommand(int dir) {
        this.dir = dir;
    }

    public ITarget action() {
        return null;
    }
}
