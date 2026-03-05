import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Building building = new Building("Kontorbygningen");

        Room mødelokale = new Room("Mødelokale");
        mødelokale.addLamp(new Lamp(40));
        mødelokale.addLamp(new Lamp(60));
        mødelokale.addWindow(new Window(120, 160));

        Room køkken = new Room("Køkken");
        køkken.addLamp(new Lamp(25));
        køkken.addLamp(new Lamp(25));
        køkken.addWindow(new Window(90, 140));


        building.addRoom(mødelokale);
        building.addRoom(køkken);


        building.printBuilding();

        System.out.println("Total lamps in building: " + building.getTotalLampCount());
        System.out.println("Total watt in building: " + building.getTotalWatt());
    }
}