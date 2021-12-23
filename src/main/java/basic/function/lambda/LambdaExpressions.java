package basic.function.lambda;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/12/23 10:56
 */
public class LambdaExpressions {
    public static Body bod = h -> h + "No Parens!";
    static Body bod2 = (h) -> h + "More details";
    static Description desc = () -> "Short info";
    static Multi mult = (h,n) -> h + n;

    static Description moreLines = () -> {
        System.out.println("moreLines");
        return "from moreLines";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi!",3.1415926));
        System.out.println(moreLines.brief());
    }
}
