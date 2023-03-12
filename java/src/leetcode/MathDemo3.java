package leetcode;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/04 22:56
 **/
public class MathDemo3 {
    public static void main(String[] args) {
        int count=0;

        for(int i=100;i<=999;i++)
        {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;


           double sum=Math.pow(ge,3)+ Math.pow(shi,3)+ Math.pow(bai,3);
           if(sum==i)
               System.out.println(i+" ,");
        }
    }

}