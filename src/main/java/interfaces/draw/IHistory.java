package interfaces.draw;

import interfaces.game.IGameObject;

import java.net.URL;
import java.util.Iterator;

/**
 * Created by kkp on 17.08.15.
 */
public interface IHistory {
    void setConfig(URL configFile); //set game Configuratinn
    void addGameStep(IGameStep step);
    void addGameStep(final Iterator<IGameObject> objs);
}
