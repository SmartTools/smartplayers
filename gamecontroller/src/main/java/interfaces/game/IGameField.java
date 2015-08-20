package interfaces.game;

/**
 * Run players' strategies until someone win.
 */
public interface IGameField {
    /** Realizes one game step */
    void update();
}
