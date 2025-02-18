package org.skypro.skyshop.article;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchableList;
    private int size;

    public SearchEngine(List<Searchable> searchableList) {
        this.searchableList = searchableList;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = -1;

        for (Searchable item : searchableList) {
            String searchTerm = item.getSearchTerm();
            int count = countOccurrences(searchTerm, search);

            if (count > maxCount) {
                maxCount = count;
                bestMatch = item;
            }
        }

        if (bestMatch == null || maxCount == 0) {
            throw new BestResultNotFound("Нет подходящего результата для запроса: " + search);
        }

        return bestMatch;
    }

    private int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public void add(Searchable item) {
        searchableList.add(item);
    }

    public List<Searchable> search(String searchTerm) {
        List<Searchable> result = new ArrayList<>();
        for (Searchable item : searchableList) {
            if (item.getSearchTerm().contains(searchTerm)) {
                result.add(item);
            }
        }

        result.forEach(item -> System.out.println(item.getStringRepresentation()));
        return result;
    }
}
        /* Searchable[] resultTrimmed = Arrays.copyOf(result, count);

        for (Searchable item : resultTrimmed) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }

        return resultTrimmed;*/

