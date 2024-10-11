package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    // Метод повертає список імен
    public List<String> getData() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Lucy");
        names.add("Denis");
        names.add("Tom");
        return names;
    }
}