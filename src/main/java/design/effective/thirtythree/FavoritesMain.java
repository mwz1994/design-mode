package design.effective.thirtythree;

public class FavoritesMain {
    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavorites(String.class,"hello world");
        favorites.putFavorites(Integer.class,23);
        favorites.putFavorites(Class.class,Favorites.class);
        String fstr = favorites.getFavorites(String.class);
        int val = favorites.getFavorites(Integer.class);
        Class<?> c = favorites.getFavorites(Class.class);
        System.out.print(String.format("%s %d %s",fstr,val,c.getName()));
    }
}
