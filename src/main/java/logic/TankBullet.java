package logic;

/**
 * Created by byzilio on 14.07.15.
 */
public class TankBullet implements Bullet {
    public void update() {
        System.out.println("Bullet update");
    }

    public boolean chechOnHit() {
        return false;
    }
}
