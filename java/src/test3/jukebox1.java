package test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/10 18:39
 **/
public class jukebox1 {
    ArrayList<String> songList=new ArrayList<String>();

    public static void main (String[] args){
        new jukebox1().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
    }

    public

    void getSongs(){
        try{
            File file =new File("Songlist.txt");
            BufferedReader reader =new BufferedReader(new FileReader(file));
            String line =null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    void addSong(String lineToParse){
        String [] tokens =lineToParse.split("/");
        songList.add(tokens[0]);

    }



}
