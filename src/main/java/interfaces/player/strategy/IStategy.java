package interfaces.player.strategy;

import interfaces.player.acces.GameState;

/**
 * Created by kkp on 03.08.15.
 * интерфейс стратегии, реазилуемый игроком
 */
public interface IStategy {
    void step(GameState state);
}
