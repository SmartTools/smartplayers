
/**
 * Created by kkp on 23.07.15.
 */
public interface Panzer extends MoveableObject {
    void shot();
    boolean haveFuel();
    boolean onReload();
}