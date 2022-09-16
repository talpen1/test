package test3;
import java.io.*;
public class test34 {

        public static void main(String[] args){
           try {
                BufferedWriter out = new BufferedWriter(new FileWriter("run.txt"));
                out.write("有电动车111");
                out.close();
                System.out.println("已发出警报");
           }
            catch (IOException e) {
            }
            }
        }

