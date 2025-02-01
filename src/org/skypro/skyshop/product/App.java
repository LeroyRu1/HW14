package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 20);
        Product pear = new Product("Груша", 30);
        Product bananas = new Product("Бананы", 50);
        Product oranges = new Product("Апельсины", 60);
        Product melon = new Product("Дыня", 10);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(pear);
        basket.addProduct(bananas);
        basket.addProduct(oranges);
        basket.addProduct(melon);

        basket.printBasket();

        Product lemon = new Product("Лимон", 15);
        basket.addProduct(lemon);

        System.out.println("В корзине есть груша? " + basket.isProductInBasket("Груша"));
        System.out.println("В корзине есть лимон? " + basket.isProductInBasket("Лимон"));

        basket.clearBasket();
        basket.printBasket();
        int totalPrice = basket.getTotalPrice();
        System.out.println("Общая стоимость корзины после очистки: " + totalPrice);
        System.out.println("Есть ли в корзине дыня? " + basket.isProductInBasket("Дыня"));



    }
}