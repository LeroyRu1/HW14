package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
    /*    SimpleProduct apple = new SimpleProduct ("Яблоко", 20);
        SimpleProduct  pear = new SimpleProduct ("Груша", 30);
        SimpleProduct  bananas = new SimpleProduct ("Бананы", 50);
        SimpleProduct  oranges = new SimpleProduct ("Апельсины", 60);
        SimpleProduct  melon = new SimpleProduct ("Дыня", 10);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(pear);
        basket.addProduct(bananas);
        basket.addProduct(oranges);
        basket.addProduct(melon);

        basket.printBasket();

        Product lemon = new SimpleProduct ("Лимон", 15);
        basket.addProduct(lemon);

        System.out.println("В корзине есть груша? " + basket.isProductInBasket("Груша"));
        System.out.println("В корзине есть лимон? " + basket.isProductInBasket("Лимон"));

        basket.clearBasket();
        basket.printBasket();
        int totalPrice = basket.getTotalPrice();
        System.out.println("Общая стоимость корзины после очистки: " + totalPrice);
        System.out.println("Есть ли в корзине дыня? " + basket.isProductInBasket("Дыня")); */

        ProductBasket basketNew = new ProductBasket();
        basketNew.addProduct(new SimpleProduct("Арбуз", 80));
        basketNew.addProduct(new DiscountedProduct("Киви", 70, 20));
        basketNew.addProduct(new DiscountedProduct("Грейпфрукт", 150, 30));
        basketNew.addProduct(new FixPriceProduct("Мандарины"));
        basketNew.printReceipt();

    }
}