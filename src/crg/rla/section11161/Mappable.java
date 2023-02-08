package crg.rla.section11161;

abstract class Location implements Mappable{
    protected String label;
    protected String geometryType;
    protected String iconType;
    protected String usage;

    public Location(String label, String geometryType, String iconType, String usage) {
        this.label = label;
        this.geometryType = geometryType;
        this.iconType = iconType;
        this.usage = usage;
    }
}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    String label(); //return how it will be described

    String geometryType(); //return POINT or LINE as on map

    String iconType(); //aka map marker, e.g. red star OR dotted red line,
    //or push pin or triangle

    String usage(); //**personal addition, for 'usage'

    default void toJSON() {
        StringBuilder project = new StringBuilder(30);
        project.append(String.format("\"type\": \"%s\"", geometryType()));
        project.append(String.format(", \"label\": \"%s (%s)\"",
                label(), usage()));
        project.append(String.format(", \"marker\": \"%s\"", iconType()));
        project.append(String.format(", \"usage\": \"%s\"", usage()));
        System.out.printf(JSON_PROPERTY, project);
    }

    static void printProperties(Mappable item) {
        System.out.println("Class: " + item.getClass().getSimpleName() +
                ".");
        System.out.print("Contents...");
        item.toJSON();
    }
}
