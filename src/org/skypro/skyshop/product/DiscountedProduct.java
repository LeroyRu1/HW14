package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        if (basePrice<=0) {
            throw new IllegalArgumentException("Базовая цена не может быть равна 0!");
        } if (discount <0 || discount >100) {
            throw new IllegalArgumentException("Размер скидки должжен быть в диапазоне от 0 до 100 включительно!");
        }
        this.basePrice = basePrice;
        this.discount = discount;

    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public int getPrice() {
        return basePrice * (1 - discount / 100);
    }

   @Override
    public boolean isSpecial() {
        return true;
    }

   /* @Override
    public String toString() {
        return name + ": " + getPrice() + " (" + discount + "%)";
    }*/
}
