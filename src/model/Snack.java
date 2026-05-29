package model;

public class Snack extends MenuItem {

    public Snack(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Snack: " + getName() +
               " | Price: " + getPrice() +
               " | Quantity: " + getQuantity() +
               " | Total: " + calculateTotal();
    }
}
