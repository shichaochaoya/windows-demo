package design.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaplayer advancedMediaplayer;
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaplayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaplayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaplayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaplayer.playMp4(fileName);
        }
    }
}
