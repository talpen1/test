package Sport;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/04 15:42
 **/
public class pingpang extends Sporter implements english{

    public pingpang(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("zhengzai xuexi ");

    }

    @Override
    public void speakEnglish() {
        System.out.println("zhengzai xuexi  english ");

    }
}