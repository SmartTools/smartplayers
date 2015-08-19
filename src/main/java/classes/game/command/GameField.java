package classes.game.command;

import interfaces.game.IGameField;

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

    @Override
    public Integer getLeftBound() {
        return null;
    }

    @Override
    public Integer getRightBound() {
        return null;
    }

    @Override
    public Integer getTopBound() {
        return null;
    }

    @Override
    public Integer getBottomBound() {
        return null;
    }
}
