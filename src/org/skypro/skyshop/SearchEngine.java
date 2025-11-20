
package org.skypro.skyshop;

import org.skypro.skyshop.product.org.skypro.skyshop.basket.Article;
import org.skypro.skyshop.product.org.skypro.skyshop.basket.Searchable;

import java.util.List;

public class SearchEngine {

    private Searchable[] items;
    private int count;



    public SearchEngine(int size) {
        this.items = new Searchable[size];
        this.count = 0;

        this.items = new Searchable[size];
        this.count = 0;
    }

    public static Searchable findBestMatch(String searchTerm2, List<Searchable> items) {
        return null;
    }

    public Searchable[] add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            // Можно добавить обработку переполнения, если нужно
            System.out.println("Массив полон, добавление невозможно");
        }
        return new Searchable[0];
    }
    public Searchable[] search(String searchTerm){
            Searchable[] results = new Searchable[5];
            int foundCount = 0;

            for (Searchable item : items) {
                if (item != null && item.getSearchTerm().contains(searchTerm)) {
                    results[foundCount++] = item;
                    if (foundCount == 5) {
                        break;
                    }


                return results;
            }}
        return results;
    }}




