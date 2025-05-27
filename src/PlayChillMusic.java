import javax.sound.sampled.*;

public class PlayChillMusic {

    private static Clip clip;
    private static long currentFrame = 0;

    public static void play() {
        try {
            if (clip == null) {
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(PlayChillMusic.class.getResource("/resources/Chill.wav")));
            }
            clip.setMicrosecondPosition(currentFrame);
            clip.start();
        } catch (Exception e) {
            System.out.println("Could not play chill music: " + e.getMessage());
        }
    }

    public static void pause() {
        if (clip != null && clip.isRunning()) {
            currentFrame = clip.getMicrosecondPosition();
            clip.stop();
            System.out.println("Paused");
        }
    }

    public static void stop() {
        if (clip != null) {
            clip.stop();
            clip.setMicrosecondPosition(0);
            currentFrame = 0;
            System.out.println("Stopped");
        }
    }
}
