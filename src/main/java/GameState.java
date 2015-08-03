import java.util.Iterator;

/**
 * Created by kkp on 03.08.15.
 * интерфейс состояния игрового поля , передаётся в IStrategy.step
 */
public interface GameState {
    IRadar getRadar();
    Iterator<Panzer> getControl();
}
