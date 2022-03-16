package basic.action.c1;

public interface Predicate<T> {

    boolean test(T t);

    default String getStr(){
        return "def";
    }
}
