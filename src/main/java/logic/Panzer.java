package logic;

/**
 * Created by kkp on 23.07.15.
 */
public interface Panzer {
    void rotate();
    void move();
    void shot();
    void stop();

    boolean haveFuel();
    boolean onReload();
}