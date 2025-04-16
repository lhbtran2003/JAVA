package bai4;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            System.out.println(audioType + " hong có bé ơi");
        }
    }
}
