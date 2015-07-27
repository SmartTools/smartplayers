import java.util.ArrayList;

/**
 * Created by byzilio on 20.07.15.
 * В run находится алгоритм
 * ArrayList<InformationObject> in  лист со всеми обьектами на карте
 * ArrayList<MoveableObject> out лист обьектов которыми может управлять данный игрок
 */
public interface Player {
    void run(ArrayList<InformationObject> radar,ArrayList<MoveableObject> their);
}
