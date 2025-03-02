package org.skypro.skyshop;

import org.skypro.skyshop.article.*;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        basket.addProduct(new Product("Яблоко", 50));
        basket.addProduct(new Product("Бананы", 100));
        basket.addProduct(new Product("Апельсины", 20));
        basket.addProduct(new Product("Виноград", 40));
        basket.addProduct(new Product("Киви", 60));
        basket.addProduct(new Product("Яблоко", 50));


        System.out.println("Содержимое корзины:");
        basket.printBasket();

        basket.removeProducts("Яблоко");
        basket.printBasket();

        List<Searchable> searchableList = new ArrayList<>();
        searchableList.add(new SearchableItem("Яблочный сок", "Сок из яблок"));
        searchableList.add(new SearchableItem("Апельсиновый сок", "Сок из апельсин"));
        searchableList.add(new SearchableItem("Малиноый морс", "Морс из малины"));
        searchableList.add(new SearchableItem("Яблочный сок", "Вкусный сок из яблок"));

        SearchEngine searchEngine = new SearchEngine(searchableList);
        System.out.println("Результат поиска по слову ,сок,: ");

        Map<String, List<Searchable>> searchResults = searchEngine.search("сок");
        for (Map.Entry<String, List<Searchable>> entry : searchResults.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            for (Searchable item: entry.getValue()) {
                System.out.println(" - " + item.getStringRepresentation());
            }
        }


    }
}