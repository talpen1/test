package test6;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args)
    {
        ActionListener listener=new TimePrinter();
        Timer t =new Timer(String.valueOf(10000));
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);

    }
}
