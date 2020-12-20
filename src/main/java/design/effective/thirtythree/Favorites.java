package design.effective.thirtythree;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
    private Map<Class<?>,Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<T> t,T instance){
        favorites.put(Objects.requireNonNull(t), instance);
    }

    <T> T getFavorites(Class<T> t){
        return t.cast(favorites.get(t));
    }

}
