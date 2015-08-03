/**
 * Created by kkp on 27.07.15.
 * Интерфейс команды , изменяющей состояние
 */
public interface ICommand {
    ITarget action();
}
