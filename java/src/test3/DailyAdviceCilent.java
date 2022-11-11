package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/06 20:30
 **/
public class DailyAdviceCilent {
    public void go () throws IOException {
        try{
        Socket s= new Socket("127.0.0.1",4242);
        InputStreamReader streamReader=new InputStreamReader(s.getInputStream());
        BufferedReader reader= new BufferedReader(streamReader);

        String advice =reader.readLine();
        System.out.println("Today you should "+ advice);

        reader.close();


    }
        catch (IOException ex){
                ex.printStackTrace();
            }
        }

    public static  void main(String[] args) throws IOException {
        DailyAdviceCilent cilent =new DailyAdviceCilent();
        cilent.go();
    }
}
