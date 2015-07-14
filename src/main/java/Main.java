import logic.Battlefield;

/**
 * Created by byzilio on 14.07.15.
 */
public class Main {
    public static void main(String[] args){
        Battlefield bf = new Battlefield();
        while (true){
            bf.update();
        }
    }
}
