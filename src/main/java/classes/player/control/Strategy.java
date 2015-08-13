package classes.player.control;

import interfaces.game.IGameState;
import interfaces.player.components.IPanzer;
import interfaces.player.components.ITarget;
import interfaces.player.strategy.IStrategy;
import org.apache.commons.collections.IteratorUtils;

import java.util.List;

/**
 * Created by kkp on 13.08.15.
 */
public class Strategy implements IStrategy {
    @Override
    public void step(IGameState state) {

        List<IPanzer> panzers = IteratorUtils.toList(state.getControl());
        List<ITarget> enemys = IteratorUtils.toList(state.getRadar().getTargets());

        for (IPanzer panzer : panzers) {
            if (enemys.contains(panzer.getTarget())) {
                enemys.remove(panzer.getTarget());
            }
        }

        for (IPanzer panzer : panzers) {
            boolean hasAim = false;
            for (ITarget enemy : enemys) {
                if (onFireLine(panzer.getTarget(), enemy)) {
                    hasAim = true;
                }


            }
            if (hasAim) {
                panzer.getControl().fire();
            }
            else {
                panzer.getControl().rotateRight();
            }
        }
    }

    private boolean onFireLine(ITarget gunner,ITarget aim) {
        double x = gunner.getLocation().getX();
        double y = gunner.getLocation().getY();
        double ax = aim.getLocation().getX();
        double ay = aim.getLocation().getY();
        for (int i=0; i<100;i+=3) {
            if (range(x, y, ax, ay)<=2) {
                return true;
            }
            x += gunner.getDirection().getX() * 3   ;
            y += gunner.getDirection().getY() * 3;
        }
        return false;
    }

    private double range(double x, double y, double ax, double ay){
        return Math.sqrt( Math.pow((x - ax) , 2) + Math.pow((y - ay) , 2));
    }

}
