package logic;

import java.util.ArrayList;

/**
 * Created by byzilio on 14.07.15.
 */
public class Battlefield {
    ArrayList<Unit> tanks;
    ArrayList<Bullet> bullets;

    public Battlefield(){
        tanks = new ArrayList<Unit>();
        bullets = new ArrayList<Bullet>();

        tanks.add(new Tank());

        bullets.add(new TankBullet());
    }

    public void update(){
        for(Bullet bullet : bullets){
            bullet.update();
        }
        for(Unit unit : tanks){
            unit.update();
        }
    }
}
