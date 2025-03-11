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
        return basket.values().stream()
                .flatMap(Collection::stream)
                .mapToInt(Product::getPrice)
                .sum();
    }

    public void printBasket() {
        if (productCount == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        basket.values().stream()
                .flatMap(Collection::stream)
                .forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Количество специальных товаров: " + getSpecialCount(50));
    }

    private long getSpecialCount(int threshold) {
        return basket.values().stream()
                .flatMap(Collection::stream)
                .filter(product -> product.getPrice() > threshold)
                .count();
    }


    public List<Product> removeProducts(String name) {
        List<Product> removed = basket.remove(name);
        if (removed != null) {
            productCount -= removed.size();
        }
        return removed != null ? removed : new ArrayList<>();
    }


}