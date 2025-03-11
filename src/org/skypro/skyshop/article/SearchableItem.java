package org.skypro.skyshop.article;

public class SearchableItem implements Searchable {
    private String name;
    private String description;

    public SearchableItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getStringRepresentation() {
        return name + " - " + description;
    }
}
