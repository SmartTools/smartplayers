package interfaces.draw;

import java.net.URL;

/**
 * Created by kkp on 17.08.15.
 */
public interface IDrawField {
    void setHistory(IHistory histgitory);
    void setVisiableConfig(URL file);
    void drawStep(IGameStep step);
}
