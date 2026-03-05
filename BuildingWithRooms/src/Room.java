import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        int total = 0;
        for (Lamp lamp : lamps) {
            total += lamp.getWatt();
        }
        return total;
    }

    public int getTotalWindowArea() {
        int total = 0;
        for (Window window : windows) {
            total += window.getAreaCm2();
        }
        return total;
    }

    public void printRoom() {
        System.out.println("== Room: " + name + " ==");
        System.out.println("Lamps (" + lamps.size() + "), total watt: " + getTotalWatt());
        for (Lamp lamp : lamps) {
            System.out.println("  - " + lamp);
        }
        System.out.println("Windows (" + windows.size() + "), total area cm2: " + getTotalWindowArea());
        for (Window window : windows) {
            System.out.println("  - " + window);
        }
        System.out.println();
    }
}
