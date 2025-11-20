
package org.skypro.skyshop.product.org.skypro.skyshop.basket;

import java.util.List;

public class SearchEngine {
    public static Searchable findBestMatch(String search, List<Searchable> items) throws Throwable {
        if (items == null || items.isEmpty()) {
            throw new Throwable("Нет подходящих объектов для поиска по запросу: " + search);
        }

        Searchable bestMatch = null;
        int maxCount = -1;

        for (Searchable item : items) {
            String term = item.getSearchTerm();
            int count = 0;
            int index = 0;
            while ((index = term.indexOf(search, index)) != -1) {
                count++;
                index += search.length();
            }
            if (count > maxCount) {
                maxCount = count;
                bestMatch = item;
            }
        }
        return bestMatch;
    }
}
