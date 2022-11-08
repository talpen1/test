package test3;

import javax.sound.midi.*;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/11/05 15:14
 **/
public class MiniMusicApp {
    public static void main(String[] arges) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();

    }

    public void play()
    {

            try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);


            ShortMessage b = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 1);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();


        }
    catch(Exception ex){
                ex.printStackTrace();

    }
    }
}