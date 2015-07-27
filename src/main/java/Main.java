import java.util.ArrayList;

/**
 * Created by kkp on 27.07.15.
 * I believe that I understand it
 */
public class Main {
    public static void main(String[] args){

        /*
        Тут как-то считывается
         */

        GameField field = new GameField() {
            ArrayList<Player> players; // Список игроков
            ArrayList<PlayableObject> gameObjects; // cписок объектов на поле

            public void update() {
                for(Player player:players){
                    ArrayList<MoveableObject> playerObjects = null;
                    ArrayList<InformationObject> information = null;
                    /*
                    *  Здесь как-то это всё преобразуется из gameObjects в playerObjects и information
                     */

                    player.run(information , playerObjects);
                }
            }
        };

        while(true){
            field.update();
        }
    }
}
