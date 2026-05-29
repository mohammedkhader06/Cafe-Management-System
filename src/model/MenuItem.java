package model;

public class MenuItem {

    private String name;
    private double price;
    private int quantity;

    public MenuItem(String name, double price, int quantity) {

        this.name = name;

        if(price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }

        if(quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double calculateTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               " | Price: " + price +
               " | Quantity: " + quantity;
    }
}