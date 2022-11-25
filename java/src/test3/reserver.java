package test3;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/25 16:52
 **/
public class reserver {
    public static void main(String[] args) {
        System.out.println(reserver1("abc"));
    }

    public static String reserver1 (String str)
    {
        String result="";

        for(int i=str.length()-1;i>=0;i--)
        {
            char s=str.charAt(i);
            result+=s;

        }
        return result;
    }
}