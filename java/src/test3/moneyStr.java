package test3;

import java.util.Scanner;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/25 17:20
 **/
public class moneyStr {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入金额");
        int MoneyNum=in.nextInt();

        String toArr="";
        while (true) {
            int num=MoneyNum%10;
            toArr=toCapital(num)+toArr;

            MoneyNum=MoneyNum/10;
            if(MoneyNum==0)
                break;
        }
        System.out.println(toArr);

    }
    public static String toCapital(int number){
        String []arr={"零","壹","贰","叁","肆","伍","陆","琦","捌","玖",};
        return arr[number];
    }



}