package crg.rla.section11161;

public class Main {

    public static void main(String[] args) {
        Location Tongariro = new Park(
                "New Zealand's oldest national park",
                "TRACKS,WALKS");
        Location Whanganui = new River(
                "Heart of the Whanganui National Park",
                "CANOE,FISH");

        Mappable.printProperties(Tongariro);
        Mappable.printProperties(Whanganui);
        Tongariro.toJSON();
        Whanganui.toJSON();
    }
}
