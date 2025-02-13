package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.article.BestResultNotFound;
import org.skypro.skyshop.article.SearchEngine;
import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

import java.sql.SQLOutput;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
   /*SimpleProduct apple = new SimpleProduct ("Яблоко", 20);
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
        System.out.println("Есть ли в корзине дыня? " + basket.isProductInBasket("Дыня"));

        ProductBasket basketNew = new ProductBasket();
        basketNew.addProduct(new SimpleProduct("Арбуз", 80));
        basketNew.addProduct(new DiscountedProduct("Киви", 70, 20));
        basketNew.addProduct(new DiscountedProduct("Грейпфрукт", 150, 30));
        basketNew.addProduct(new FixPriceProduct("Мандарины"));
        basketNew.printReceipt();

       SearchEngine searchEngine = new SearchEngine(10);
        Searchable searchable = new Product("Халва");
        Product productOne = new Product("Сыр");
        Product productTwo = new DiscountedProduct("Хлеб", 50, 10);
        Product productThree = new SimpleProduct("Молоко", 20);
        Article articleOne = new Article("Информация о Сыре", "История ипоявления и изготовления сыра");
        Article articleTwo = new Article("Информация о Масле", "История ипоявления и изготовления масла");


        searchEngine.add(productOne);
        searchEngine.add(productTwo);
        searchEngine.add(productThree);
        searchEngine.add(articleOne);
        searchEngine.add(articleTwo);

        System.out.println("Ищем результат по Сыру");
        searchEngine.search("Сыр");
        System.out.println("Ищем результат по Маслу");
        searchEngine.search("Информация о Масле");

        System.out.println("Информаиця по продукту:");
        System.out.println("Имя: " + searchable.getName());
        System.out.println("Тип контента: " + searchable.getContentType());
        System.out.println("Поисковый термин: " + searchable.getSearchTerm());
        System.out.println("Представление - " + searchable.getStringRepresentation());

        System.out.println("Информаиця о статье:");
        System.out.println("Имя: " + articleOne.getName());
        System.out.println("Тип контента: " + articleOne.getContentType());
        System.out.println("Поисковый термин: " + articleOne.getSearchTerm());
        System.out.println("Представление - " + articleOne.getStringRepresentation());*/


        try {
            SimpleProduct product1 = new SimpleProduct(" ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта: " + e.getMessage());
        }
        try {
            SimpleProduct product2 = new SimpleProduct("Лимон", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта: " + e.getMessage());
        }
        try {
            DiscountedProduct product3 = new DiscountedProduct("Арбуз", 0, 80);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта: " + e.getMessage());
        }
        try {
            DiscountedProduct product4 = new DiscountedProduct("Апельсин", 100, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта: " + e.getMessage());
        }
        try {
            SearchEngine searchEngine = new SearchEngine(Arrays.asList(
                    new Product("Мясо"),
                    new Product("Молоко"),
                    new Product("Хлеб с молоком"),
                    new Product("Хлеб")
            ));
            Searchable bestMath = searchEngine.findBestMatch("Хлеб");
            System.out.println("Лучший результат для запроса 'хлеб' " + bestMath.getName());
            searchEngine.findBestMatch("Масло");  //
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }
}