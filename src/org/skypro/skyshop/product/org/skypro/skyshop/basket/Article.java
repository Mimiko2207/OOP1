package org.skypro.skyshop.product.org.skypro.skyshop.basket;

public class Article implements Searchable {
    private final String title;
    private final String text;
    private String content;

    public Article(String title, String text, String content) {
        this.title = title;
        this.text = text;
        this.content = content;
    }


    @Override
    public String getSearchTerm() {
        return title + " " + text;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String toString() {
        return "Статья: " + title;
    }
}
