package crg.rla.section11161;

public class Park extends Location{

    public Park(String label, String usage) {
        super(label, "POINT", "TREE", usage);
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
