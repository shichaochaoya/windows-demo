package design.adapter;

public class VlcPlayer implements AdvancedMediaplayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name:"+filename);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
