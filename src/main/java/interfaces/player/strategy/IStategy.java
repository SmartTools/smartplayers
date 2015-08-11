package interfaces.player.strategy;

import interfaces.player.control.IGameState;

/**
 * Created by kkp on 03.08.15.
 * интерфейс стратегии, реазилуемый игроком
 */
public interface IStategy {
    void step(IGameState state);
}
