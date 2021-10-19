import java.util.*;
public interface Composite<T> {

    List<T> getChilrend();
    void addChild(T t);
    boolean removeChild(T t);
    boolean removeChildren(List<T> t);

}
