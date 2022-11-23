package test9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/22 22:34
 **/
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totaltime = 0;
        try (Scanner in = new Scanner(System.in))
        {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totaltime += callTime;
            }
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
        {
            System.out.println(iter.next());
        }
        System.out.println("……");
        System.out.println(words.size()+"        "+totaltime);
    }
}