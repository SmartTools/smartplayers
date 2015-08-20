package classes.game;

import classes.player.Ownership;
import classes.player.Player;
import classes.player.components.Health;
import classes.player.components.Target;
import classes.player.components.geometry.Point;
import classes.player.components.geometry.Rectangle;
import classes.player.components.geometry.Shape;
import classes.player.components.geometry.Vector;
import classes.player.control.RemoteControl;
import interfaces.IPropertySource;
import interfaces.game.IGameField;
import interfaces.game.IGameObject;
import interfaces.player.IPlayer;
import interfaces.player.components.ITarget;
import interfaces.player.control.IRemoteControl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Manages initialization of game objects
 */
public class GameManager {

    IPropertySource propertySource;

    public IGameField init() {

        Iterable<IPlayer> players = initPlayers();
        Iterable<IGameObject> objects = initGameObject(players);

        return new GameField(players, objects);
    }

    private Iterable<IPlayer> initPlayers() {

        Integer playersNum = Integer.parseInt(this.propertySource.getProperty("players.number"));
        List<IPlayer> players = new LinkedList<>();
        for (int i = 0; i < playersNum; i++) {
            //players.add(new Player());
        }
        return players;
    }

    private Iterable<IGameObject> initGameObject(final Iterable<IPlayer> players) {

        List<IGameObject> objects = new LinkedList<>();
        for (IPlayer player : players) {
            Integer panzersNumber = Integer.parseInt(this.propertySource.getProperty("panzers.number"));
            for (int i = 0; i < panzersNumber; i++) {
                //TODO: fill panzer by all its components
                Map<String, Object> panzerComponents = new HashMap<>();
                panzerComponents.put(
                    "target",
                    new Target(new Vector<Double>(1.,0.), new Point(0,0), new Rectangle(new Point(1,0),1,1), 1)
                );
                Integer panzerHealth = Integer.parseInt(this.propertySource.getProperty("panzer.health"));
                panzerComponents.put("health", new Health(panzerHealth));
                panzerComponents.put("ownership", new Ownership(player.getName()));
                IRemoteControl remoteControl = new RemoteControl(
                    (ITarget) panzerComponents.get("target"),
                    () -> {
                        IGameObject bullet = new GameObject(new HashMap<>());
                        objects.add(bullet);
                        return bullet;
                    }
                );
                objects.add(new GameObject(panzerComponents));
            }
        }
        return objects;
    }
}
