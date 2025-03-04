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


}
