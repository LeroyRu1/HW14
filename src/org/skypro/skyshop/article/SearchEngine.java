package org.skypro.skyshop.article;

import java.util.*;

public class SearchEngine {
    private Set<Searchable> searchableSet;

    public SearchEngine(Set<Searchable> searchableSet) {
        this.searchableSet = searchableSet;
    }

    public Set<Searchable> search(String searchTerm) {
        Set<Searchable> resultSet = new TreeSet<>(new Comparator<Searchable>() {
            @Override
            public int compare(Searchable o1, Searchable o2) {
                if (o1 instanceof Article && o2 instanceof Article) {
                    return new ArticleComparator().compare((Article) o1, (Article) o2);
                }
                return o1.getName().compareTo(o2.getName());
            }

        });
        for (Searchable item : searchableSet) {
            if (item.getSearchTerm().contains(searchTerm)) {
                resultSet.add(item);
            }
        }
        return resultSet;
    }
}
