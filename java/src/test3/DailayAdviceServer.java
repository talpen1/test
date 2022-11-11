package test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/10 10:12
 **/
public class DailayAdviceServer {
    String[] adviceList = {"Takesmaller bites", "go for the tight jeans", "one world",
            "just for today", "You might want to"};
    public void go()

    {
        try {
            ServerSocket serverSock = null;

                serverSock = new ServerSocket(4242);

                while (true) {
                    Socket sock = serverSock.accept();

                    PrintWriter writer = new PrintWriter(sock.getOutputStream());
                    String advice =getAdvice();
                    writer.println(advice);
                    writer.close();
                    System.out.println(advice);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    private String getAdvice() {
        int randm =(int) (Math.random()*adviceList.length);
        return adviceList[randm];
    }

    public static void main(String[] args) throws IOException {
        DailyAdviceCilent server =new DailyAdviceCilent();
        server.go();
    }

}
