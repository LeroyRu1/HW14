package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private Product[] basket = new Product[5];
    private int productCount = 0;

    public void addProduct(Product product) {
        if (productCount < basket.length) {
            basket[productCount] = product;
            productCount++;
        } else {
            System.out.println("Невозможно добавить продукт!");
        }
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < productCount; i++) {
            totalPrice += basket[i].getPrice();
        }
        return totalPrice;
    }

    public void printBasket() {
        if (productCount == 0) {
            System.out.println("в корзине пусто");
        } else {
            for (int i = 0; i < productCount; i++) {
                System.out.println(basket[i].getName() + ": " + basket[i].getPrice());
            }
            System.out.println("Итого: " + getTotalPrice());
        }
    }

    public boolean isProductInBasket(String productName) {
        for (int i = 0; i < productCount; i++) {
            if (basket[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        for (int i = 0; i < productCount; i++) {
            basket[i] = null;
        }
        productCount = 0;
    }

    public void printReceipt() {
        int totalCost = 0;
        int specialCount = 0;

        for (int i = 0; i < productCount; i++) {
            System.out.println(basket[i]);
            totalCost += basket[i].getPrice();
            if (basket[i].isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }

}
