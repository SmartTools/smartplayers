import java.util.ArrayList;

/**
 * Created by byzilio on 20.07.15.
 * В run находится алгоритм , присланный игроком
 * ArrayList<InformationObject> radar  лист со всеми обьектами на радаре
 * ArrayList<MoveableObject> their  лист обьектов которыми может управлять данный игрок
 */
public interface Player {
    void run(ArrayList<InformationObject> radar,ArrayList<UpdateableObject> their);
}
