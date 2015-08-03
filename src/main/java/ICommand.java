/**
 * Created by kkp on 27.07.15.
 * Интерфейс команды , хранимой в объкте и выполняемой при вызову update GameField'ом
 */
public interface ICommand {
    ITarget action();
}
