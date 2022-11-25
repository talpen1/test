package test3;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/25 14:48
 **/
public class stringDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String str=arrTostring(arr);
        System.out.println(str);
    }
    public static String arrTostring(int[] arr){
        if(arr==null)  return "";
        if(arr.length==0) return "[]";

        String result="[";
        {
            for (int i = 0; i < arr.length; i++) {
                if(i!=arr.length-1)
                    result += arr[i] + ",";
                else if(i==arr.length-1)
                    result+=arr[i];

            }
        }
        result+="]";
        return result;
    }
}
