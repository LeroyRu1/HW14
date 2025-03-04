package org.skypro.skyshop;

import org.skypro.skyshop.article.*;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

import java.sql.SQLOutput;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<Searchable> searchableSet = new HashSet<>();

        Product one = new Product("Яблоко", 50);
        Product two = new Product("Бананы", 100);
        Product three = new Product("Апельсины", 20);
        Product four = new Product("Виноград", 40);
        Product five = new Product("Киви", 60);
        Product six = new Product("Яблоко", 50);


        Article one1 = new Article("Яблочный сок", "Сок из яблок");
        Article two2 = new Article("Апельсиновый сок", "Сок из апельсин");
        Article three3 = new Article("Малиновый морс", "Морс из малины");
        Article four4 = new Article("Яблочный сок", "Вкусный сок из яблок");
        Article five5 = new Article("Яблочный сок", "Вкусный сок из яблок");

        searchableSet.add(one);
        searchableSet.add(two);
        searchableSet.add(three);
        searchableSet.add(four);
        searchableSet.add(five);
        searchableSet.add(six);

        searchableSet.add(one1);
        searchableSet.add(two2);
        searchableSet.add(three3);
        searchableSet.add(four4);
        searchableSet.add(five5);

        SearchEngine searchEngine = new SearchEngine(searchableSet);

        System.out.println("Продукты в корзине: ");
        for (Searchable item : searchableSet) {
            System.out.println(item.getStringRepresentation());
        }
        System.out.println("Результат поиска по слову ,сок,: ");

        Set<Searchable> searchResults = searchEngine.search("сок");
        if (searchResults.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            for (Searchable item : searchResults) {
                System.out.println(" - " + item.toString());
            }
        }
    }
}
