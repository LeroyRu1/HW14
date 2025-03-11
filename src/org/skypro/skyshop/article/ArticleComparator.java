package org.skypro.skyshop.article;

import java.util.Comparator;

public class ArticleComparator implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        int lengthComparison = Integer.compare(o2.getName().length(), o1.getName().length());
        return (lengthComparison !=0) ? lengthComparison :o1.getName().compareTo(o2.getName());
    }
}
