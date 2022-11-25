package test9;

import test4.Employee3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/23 15:53
 **/
public class MapTest {

    public static void main(String[] args) throws IOException {

        Map<String,Employee3 > staff=new HashMap<>();
        staff.put("144-25-5464",new Employee3("talpen0",7000.0));
        staff.put("144-25-5465",new Employee3("talpen1",8000.0));
        staff.put("144-25-5466",new Employee3("talpen2",9000.0));
        staff.put("144-25-5467",new Employee3("talpen3",6000.0));




       // System.out.println(staff);

        staff.remove("144-25-5464");
        staff.put("144-25-5468",new Employee3("talpen4",6000.0));
        System.out.println(staff);
        System.out.println(staff.get("144-25-5467").getName());
      //  System.out.println(staff.getOrDefault("144-25-5468", .getName()));

        staff.forEach((k,v)->
                System.out.println("key="+k+"value=" +v));

       // Runtime.getRuntime().exec("shutdown -s -t 3600" );
        //Runtime.getRuntime().exec("shutdown -a" );
        Random rand=new Random();
       System.out.println( rand.nextInt(2));


    }
}