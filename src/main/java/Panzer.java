import interfaces.IPanzer;
import interfaces.IRemoteControl;
import interfaces.ITarget;

/**
 * Created by kkp on 10.08.15.
 */
public class Panzer extends GameObject implements IPanzer{
    IRemoteControl control;
    ITarget target;

    public ITarget getTarget() {
        return target;
    }

    public IRemoteControl getControl() {
        return control;
    }
}
