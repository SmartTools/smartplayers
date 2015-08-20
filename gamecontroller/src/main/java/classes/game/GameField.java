package classes.game;

import interfaces.game.IGameField;
import utils.PropertyUtils;

import java.io.IOException;

public class GameField implements IGameField {

    private Integer leftBound;
    private Integer rightBound;
    private Integer topBound;
    private Integer bottomBound;

    public GameField(
        final Integer leftBound,
        final Integer rightBound,
        final Integer topBound,
        final Integer bottomBound
    ) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
        this.topBound = topBound;
        this.bottomBound = bottomBound;
    }

    public GameField() throws IOException {
        PropertyUtils propertyUtils = new PropertyUtils();
        this.leftBound = propertyUtils.getIntValue("bound.left");
        this.rightBound = propertyUtils.getIntValue("bound.right");
        this.topBound = propertyUtils.getIntValue("bound.top");
        this.bottomBound = propertyUtils.getIntValue("bound.bottom");
    }

    @Override
    public Integer getLeftBound() {
        return leftBound;
    }

    @Override
    public Integer getRightBound() {
        return rightBound;
    }

    @Override
    public Integer getTopBound() {
        return topBound;
    }

    @Override
    public Integer getBottomBound() {
        return bottomBound;
    }
}
