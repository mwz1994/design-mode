package basic.common;

import java.util.function.Supplier;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/12/8 16:38
 */
public class DemoNumberMax {
    public static void main(String[] args) {
        int[] numbers = {100,200,300,400,500,-600,-700,-800,-900,-1000};

        int numberMax = arrayMax(
                ()->{
                    int max = numbers[0];
                    for (int n: numbers){
                        if (max < n){
                            max = n;
                        }
                    }
                    return max;
                }
        );
    }

    private static int arrayMax(Supplier<Integer> integerSupplier) {
        System.out.println("integer supplier "+integerSupplier.get());
        return integerSupplier.get();
    }

}
