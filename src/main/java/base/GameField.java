package base;

import interfaces.logic.IGameField;
import interfaces.logic.IGameObject;
import player.components.Panzer;
import player.components.Target;
import player.control.RemoteControl;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkp on 11.08.15.
 */
public class GameField implements IGameField {

    List<IGameObject> objs;

    public void update() {
        objs = new ArrayList<IGameObject>();



        objs.add(panzer);
    }
}
