package test8;

import javafx.util.Pair;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/05/10 00:31
 **/
public class Pairtest {
    public static void main(String[] args)
    {
        String[] word={"mary","had","a","little","lamb"};
        Pair<String,String> mm= ArrayLog.minmax(word);
        System.out.println("min = "+ mm.getKey());
        System.out.println("max = "+ mm.getKey());
    }
}