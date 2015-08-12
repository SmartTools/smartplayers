package interfaces.game;

/**
 * Created by byzilio on 20.07.15.
 * В update вызывается сначала алгоритма(Player.run) 1 игрока потом 2 потом вызывается classes.player.components.Panzer.update()
 */
public interface IGameField {
    void update();  // функция , воспроизводящая 1 ход игры, т.е. алгоритмы игроков и результат итерации
}
