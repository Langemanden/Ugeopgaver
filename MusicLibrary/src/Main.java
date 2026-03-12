import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> medier = new ArrayList<>();

        medier.add(new Song("Comfortably Numb", "Pink Floyd", 382));
        medier.add(new Song("Bohemian Rhapsody", "Queen", 354));

        medier.add(new Podcast("Lex Fridman #400", "Lex Fridman", 6137));
        medier.add(new Podcast("Hard Fork", "Kevin Roose og Casey Newton", 3260));

        medier.add(new AudioBook("Dune", "Frank Herbert", 76440));
        medier.add(new AudioBook("Harry Potter og De Vises Sten", "J.K. Rowling", 32280));

        Mediaplayer player = new Mediaplayer();

        for (Playable medie : medier) {
            player.add(medie);
        }

        player.printPlaylist();
        System.out.println();

        player.playAll();
        System.out.println();

        System.out.println("Samlet spilletid: " +
                MediaItem.formatDuration(player.getTotalDuration()));
    }
}
