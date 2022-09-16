package test8;

import javafx.util.Pair;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/05/09 22:24
 **/
class ArrayLog {
    public static Pair<String ,String>minmax(String[] a)
    {
        if(a==null||a.length==0)return null;
        String min=a[0];
        String max=a[0];
        for(int i=1;i< a.length;i++)
        {
            if(min.compareTo(a[i])>0) min=a[i];
            if(max.compareTo(a[i])<0) max=a[i];
        }
        return new Pair<String,String>(min,max);
    }
}