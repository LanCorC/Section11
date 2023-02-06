package crg.rla.section11153;

import java.util.ArrayList;

public class Store {

    private ArrayList<OrderItem> shoppingCart =
            new ArrayList<>(10);

    public static void main(String[] args) {
        Store countUp = new Store();
        countUp.addOrder(new Earphones("BOSE"), 2);
        countUp.printOrder();
        countUp.addOrder(new Iceblock("Tip-top"), 1);
        countUp.addOrder(new Pie("Big Ben"), 3);
        countUp.printOrder();
    }

    public void addOrder(ProductForSale product, int quantity) {
        shoppingCart.add(new OrderItem(product, quantity));
        System.out.println(product.getClass().getSimpleName() +
                " has been added to your cart.");
    }

    public void printOrder() {
        System.out.printf("RECEIPT OF SALE%n" +
                "%3s%10s%5s%n" +
                "=".repeat(25) + "%n", "QTY", "ITEM", "AMT");

        double totalCost = 0;
        for (OrderItem item : shoppingCart) {
            item.product().printPricedLineItem(item.quantity());
            totalCost += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("%5s %20.2f%n" + "-".repeat(25) + "%n",
                "Total", totalCost);
    }

}
