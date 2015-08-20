package classes.game;

import interfaces.game.IGameField;
import utils.IPropertySource;
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
        IPropertySource property = new PropertyUtils();
        this.leftBound = Integer.getInteger(property.getProperty("bound.left"));
        this.rightBound = Integer.getInteger(property.getProperty("bound.right"));
        this.topBound = Integer.getInteger(property.getProperty("bound.top"));
        this.bottomBound = Integer.getInteger(property.getProperty("bound.bottom"));
    }

    @Override
    public Integer getLeftBound() {
        return leftBound;
    }

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
