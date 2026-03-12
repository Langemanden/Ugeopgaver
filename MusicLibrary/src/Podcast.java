public class Podcast extends MediaItem implements Playable {
    private String host;

    public Podcast(String title, String host, int durationSeconds) {
        super(title, durationSeconds);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public void play() {
        System.out.println("🎙 Afspiller podcast: \"" + getTitle() + "\" med " + host +
                " (" + formatDuration(getDurationSeconds()) + ")");
    }
}
