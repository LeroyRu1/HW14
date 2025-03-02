package org.skypro.skyshop.article;

import java.security.Provider;
import java.util.*;

public class SearchEngine {
    private List<Searchable> searchableList;

    public SearchEngine(List<Searchable> searchableList) {
        this.searchableList = searchableList;
    }

    public Map<String, List<Searchable>> search(String searchTerm) {
        Map<String, List<Searchable>> resultMap = new TreeMap<>();

        for (Searchable item : searchableList) {
            if (item.getSearchTerm().contains(searchTerm)) {
                resultMap.putIfAbsent(item.getSearchTerm(), new ArrayList<>());
                resultMap.get(item.getSearchTerm()).add(item);
            }
        }
        return resultMap;
    }
}
