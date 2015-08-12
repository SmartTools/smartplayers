package interfaces.game;

import interfaces.player.components.IPanzer;
import interfaces.player.components.IRadar;

import java.util.Iterator;

/**
 * Created by kkp on 03.08.15.
 * интерфейс состояния игрового поля , передаётся в IStrategy.step
 */
public interface IGameState {
    IRadar getRadar();
    Iterator<IPanzer> getControl();
}
