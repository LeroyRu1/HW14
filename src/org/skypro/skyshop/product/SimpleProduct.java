package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        if (price<= 0) {
            throw new IllegalArgumentException("Цена продекта не может быть меньше 0 или 0!");
        }
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

   /* @Override
    public String toString() {
        return name + ": " + getPrice();
    }*/
}
