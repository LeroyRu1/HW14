package org.skypro.skyshop.article;

import java.security.Provider;
import java.util.Arrays;

public class SearchEngine {
    private Searchable[] searchableItems;
    private int size;

    public SearchEngine(int capacity) {
        searchableItems = new Searchable[capacity];
        size = 0;
    }

    public void add(Searchable item) {
        if (size < searchableItems.length) {
            searchableItems[size] = item;
            size++;
        } else {
            Searchable[] newArray = new Searchable[searchableItems.length * 2];
            System.arraycopy(searchableItems, 0, newArray, 0, searchableItems.length);
            searchableItems = newArray;
            searchableItems[size] = item;
            size++;
        }
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] result = new Searchable[5];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (searchableItems[i].getSearchTerm().contains(searchTerm)) {
                result[count] = searchableItems[i];
                count++;

                if (count == 5) {
                    break;
                }
            }
        }
        Searchable[] resultTrimmed = Arrays.copyOf(result, count);

        for (Searchable item : resultTrimmed) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }

        return resultTrimmed;
    }
}
