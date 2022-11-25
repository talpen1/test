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
        int money;
        while (true) {
            System.out.println("请输入一个数字");
            money=in.nextInt();
            if(money>=0 &&money<=9999999)
                break;
            else
                System.out.println("金额无效");
        }

        String moneySTr="";

        while (true) {
            int ge =money%10;
            String moneyCapital="";
            moneyCapital=getCapitalNumber(ge);
            moneySTr=moneyCapital+moneySTr;
            money=money/10;
            if(money==0)
                break;
        }
        System.out.println(moneySTr);



    }
    public static String getCapitalNumber(int num){
        String[]arr={"零","壹","贰","仨","肆","伍","陆","柒","捌","玖"};
        return arr[num];
    }
}