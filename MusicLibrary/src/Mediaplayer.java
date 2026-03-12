import java.util.ArrayList;

public class Mediaplayer {
    private ArrayList<Playable> playlist;

    public Mediaplayer() {
        playlist = new ArrayList<>();
    }

    public void add(Playable item) {
        playlist.add(item);
    }

    public void playAll() {
        for (Playable item : playlist) {
            item.play();
        }
    }

    public int getTotalDuration() {
        int total = 0;
        for (Playable item : playlist) {
            total += item.getDurationSeconds();
        }
        return total;
    }

    public void printPlaylist() {
        System.out.println("=== Playlist (" + playlist.size() + " elementer) ===");
        for (int i = 0; i < playlist.size(); i++) {
            Playable item = playlist.get(i);
            System.out.println((i + 1) + ". \"" + item.getTitle() + "\" – "
                    + MediaItem.formatDuration(item.getDurationSeconds()));
        }
    }
}
