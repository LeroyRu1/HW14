package org.skypro.skyshop.product;


import org.skypro.skyshop.article.Searchable;

public class Product implements Searchable {
    private final String name;
    private int price;

    public Product(String name) {
        this.name = name;

    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return name;
    }
public int getPrice () {
        return price;
}

    @Override
    public String toString() {
        return "Продукт: " + name;
    }

    public boolean isSpecial() {
        return false;
    }
}

