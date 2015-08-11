package interfaces.player.components;

import java.util.Iterator;

/**
 * Created by kkp on 03.08.15.
 */


public interface IRadar {
    Iterator<ITarget> getTargets(); //возвращает цели на радаре
}
