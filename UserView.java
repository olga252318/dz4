import java.util.List;

public interface UserView<T extends User> {

    public void sendOnConsole(List<T> list); // использован принцип открытости-закрытости
    
}
