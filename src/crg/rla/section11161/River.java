package crg.rla.section11161;

public class River extends Location{

    public River(String label, String usage) {
        super(label, "LINE", "SOLID BLUE LINE", usage);
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public String geometryType() {
        return geometryType;
    }

    @Override
    public String iconType() {
        return iconType;
    }

    @Override
    public String usage() {
        return usage;
    }
}
