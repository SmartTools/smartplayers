package classes.draw;

import interfaces.draw.IGameStep;
import interfaces.draw.IHistory;
import interfaces.game.IGameObject;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kkp on 20.08.15.
 */
public class History implements IHistory {
    URL config;
    List<IGameStep> steps;
    @Override
    public void setConfig(URL config) {
        this.config = config;
    }

    @Override
    public void addGameStep(IGameStep step) {
        steps.add(step);
    }

    @Override
    public void addGameStep(Iterator<IGameObject> objs) {
        steps.add(new GameStep());
    }

    @Override
    public IGameStep nextStep() {
        return null;
    }
}
