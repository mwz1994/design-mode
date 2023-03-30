package cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author aspirin
 * @version 1.0
 * @date 2023/3/29 14:08
 *
 * 参考文章 https://tech.meituan.com/2022/05/12/principles-and-practices-of-completablefuture.html
 */
public class SimpleCompletableFuture {

    /**
     * 零依赖的 CompletableFuture cf0,cf1,cf2
     * 一元依赖 CompletableFuture cf3,cf5
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 1 使用 runAsync 或 supplyAsync 发起异步调用
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()-> "result 1", executor);

        // 2.CompletableFuture.completedFuture() 直接创建一个已完成状态的 CompletableFuture
        CompletableFuture<String> cf2 = CompletableFuture.completedFuture("result 2");

        // 3.先创建一个未完成状态的CompletableFuture, 然后通过 complete()、 completeExceptionally()、完成该 CompletableFuture
        CompletableFuture<String> cf0 = new CompletableFuture<>();
        cf0.complete("success");


        // 一元依赖，可以通过thenApply、thenAccept、thenCompose 等方法实现
        CompletableFuture<String> cf3 = cf1.thenApply(r1 -> {
            // r1 为 cf1 的结果
            // ...
            return "result 3";
        });

        CompletableFuture<String> cf5 = cf2.thenApply(r2 -> {
            // r2 为 cf2 得结果
            // ...
            return "result 5";
        });

        // 二元依赖，可以通过 thenCombine 等来实现
        CompletableFuture<String> cf4 = cf1.thenCombine(cf2, (r1, r2) -> {
           // r1 , r2 为 cf1 和 cf2 的结果
           return "result 4";
        });

        /**
         *
         * 多元依赖，可以通过allOf 或 anyOf 方法来实现
         * 区别是当需要多个依赖全部完成时使用allOf，当多个依赖中的任意一个完成即可时使用anyOf
          */
        CompletableFuture<Void> cf6 = CompletableFuture.allOf(cf3,cf4,cf5);

        CompletableFuture<String> result = cf6.thenApply(v -> {
            // 这里 join 不会阻塞，因为传给 thenApply 的函数是在 cf3, cf4, cf5 全部完成时，才会执行

            var r3 = cf3.join();
            var r4=  cf4.join();
            var r5 = cf5.join();

            // 根据 r3, r4, r5 组装返回最终 result

            return "result";
        });

    }
}
