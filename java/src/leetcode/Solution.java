package leetcode;

import java.util.*;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/13 20:29
 **/
public class Solution {
  //  public List<List<Integer>> permute(int[] nums){
//        int len =nums.length;
//        List<List<Integer>> res =new ArrayList<>();
//        Collection
  public static void main(String[] args) {
        List<String> staff=new LinkedList<>();
        staff.add("talpen");
        staff.add("talpen1");
        staff.add("talpe2");
        ListIterator<String> iter= staff.listIterator();
        iter.next();
        iter.remove();

        iter.add("talpen3");
        iter.previous();
        iter.add("talpen4");
        iter.next();
        iter.remove();
        System.out.println(staff);
        boolean s=staff.contains("talpen4");
        System.out.println(s);
    }

}