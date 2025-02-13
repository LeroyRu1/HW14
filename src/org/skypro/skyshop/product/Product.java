package org.skypro.skyshop.product;


import org.skypro.skyshop.article.Searchable;

public class Product implements Searchable {
    private final String name;
    private int price;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым или иметь пробелы!");
        }
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return false;
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
    public String getStringRepresentation() {
        return "Продукт: " + name;
    }

}

