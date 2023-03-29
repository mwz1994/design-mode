package cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author aspirin
 * @version 1.0
 * @date 2023/3/29 11:05
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行步骤 1");
            return "step 1 result ";
        }, executor);

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行步骤 2");
            return "step 2 result";
        });

        cf1.thenCombine(cf2 , (r1, r2) -> {
            System.out.println("---------------------");
            System.out.println(r1 + " , "+ r2);
            System.out.println("执行步骤 3");
            return "step 3 result";
        }).thenAccept(r3 -> System.out.println(r3));
    }
}
