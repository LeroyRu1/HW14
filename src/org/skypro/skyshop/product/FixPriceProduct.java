package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private String name;
    private static final int FIX_PRICE = 10;

    public FixPriceProduct(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

  @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return name + ": Фиксированная цена " + FIX_PRICE;
    }

}
