package basic.netty.callback;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/4 15:21
 */
public class Data {
    private int n;
    private int m;

    public Data(int n, int m){
        this.n = n ;
        this.m = m;
    }

    public String toString(){
        int r = n/m ;
        return  n + "/" + m + " = " + r;
    }
}
