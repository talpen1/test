package test9;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/23 12:39
 **/
public class PriortyQueuetest {
    public static void main (String[] args)
    {
        PriorityQueue<LocalDate> pq=new PriorityQueue<>();
        pq.add(LocalDate.of(1996,12,1));
        pq.add(LocalDate.of(1994,1,2));
        pq.add(LocalDate.of(1994,1,3));

        System.out.println("Iterating over elements.....");
        for(LocalDate date:pq)
        {
            System.out.println(date);
        }
        System.out.println("Removing elements");
        while(!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}