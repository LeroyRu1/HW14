package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductBasket {
    private List <Product> basket = new ArrayList<>();
    private int productCount = 0;

    public void addProduct(Product product) {
        basket.add(product);
            productCount++;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product: basket) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printBasket() {
        if (productCount == 0) {
            System.out.println("в корзине пусто");
        } else {
            for (Product product: basket) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
            System.out.println("Итого: " + getTotalPrice());
        }
    }

    public boolean isProductInBasket(String productName) {
        for (Product product: basket) {
            if (product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        basket.clear();
        productCount = 0;
    }

    public List<Product> removeProducts (String name) {
        List<Product> removeProducts = new ArrayList<>();
        basket.removeIf(product -> {
            if (product.getName().equals(name)) {
                removeProducts.add(product);
                return true;
            }
            return false;
        });
        productCount = basket.size();
        return removeProducts;
    }


    public void printReceipt() {
        int totalCost = 0;
        int specialCount = 0;

        for (Product product: basket) {
            System.out.println(product);
            totalCost += product.getPrice();
            if (product.isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }

}
