package org.skypro.skyshop.product.org.skypro.skyshop.basket;

public interface Searchable {

    private Searchable[] items;
    private int count;

    String getSearchTerm();

    // Метод получения типа контента
    String getContentType();

    // Метод получения имени объекта
    String getName();

    // Метод преобразования в строку с дефолтной реализацией
    default String getStringRepresentation() {
        return getName() + " — тип " + getContentType();

    }
    public void SearchEngine(int size) {
        this.items = new Searchable[size];
        this.count = 0;
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            // Можно добавить обработку переполнения, если нужно
            System.out.println("Массив полон, добавление невозможно");
        }
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        for (Searchable item : items) {
            if (item != null && item.getSearchTerm().contains(searchTerm)) {
                results[foundCount++] = item;
                if (foundCount == 5) {
                    break;
                }
            }

        return results;
    }

    }

}
