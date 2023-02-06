package crg.rla.section11153;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final void printPricedLineItem(int quantity) {
        System.out.printf("%3d %10s %5.2f%n", quantity, type,
                getSalesPrice(quantity));
        //10 spaces for product name, 5 spaces for price ###.##
    }

    public final double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public final void showDetails() {
        System.out.println(type + ": " + description + " (" +
                getClass().getSimpleName() + ")");
    }
}
