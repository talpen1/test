package leetcode;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/04 22:47
 **/
public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(997));

    }

    public static boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
}