// UtilityClass.java
import java.util.ArrayList;

public class CollectAll {
    public static <T> ArrayList<T> collectAll(T[] objects, Filter filter) {
        ArrayList<T> result = new ArrayList<>();
        for (T obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}
