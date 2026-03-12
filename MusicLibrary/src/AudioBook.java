public class AudioBook extends MediaItem implements Playable {
    private String author;

    public AudioBook(String title, String author, int durationSeconds) {
        super(title, durationSeconds);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void play() {
        System.out.println("📖 Afspiller lydbog: \"" + getTitle() + "\" af " + author +
                " (" + formatDuration(getDurationSeconds()) + ")");
    }
}
