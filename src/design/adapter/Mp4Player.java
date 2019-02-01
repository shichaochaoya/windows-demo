package design.adapter;

public class Mp4Player implements AdvancedMediaplayer {
    @Override
    public void playVlc(String filename) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:"+fileName);
    }
}
