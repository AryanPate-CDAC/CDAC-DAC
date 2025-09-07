interface AudioPlayer {
    void playAudio(String song);
}

interface VideoPlayer {
    void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer {
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

public class Media {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.playAudio("Shape of You");
        player.playVideo("Inception");
    }
}
