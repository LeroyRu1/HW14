package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>> basket = new HashMap<>();
    private int productCount = 0;

    public void addProduct(Product product) {
        basket.putIfAbsent(product.getName(), new ArrayList<>());
        basket.get(product.getName()).add(product);
        productCount++;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public void printBasket() {
        if (productCount == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (Map.Entry<String, List<Product>> entry : basket.entrySet()) {
            for (Product product : entry.getValue()) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }

        System.out.println("Итого: " + getTotalPrice());
    }


    public List<Product> removeProducts(String name) {
        List<Product> removed = basket.remove(name);
        if (removed != null) {
            productCount -= removed.size();
        }
        return removed != null ? removed : new ArrayList<>();
    }


}