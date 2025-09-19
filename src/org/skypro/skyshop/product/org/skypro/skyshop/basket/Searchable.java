package org.skypro.skyshop.product.org.skypro.skyshop.basket;

public interface Searchable {


    String getSearchTerm();

    // Метод получения типа контента
    String getContentType();

    // Метод получения имени объекта
    String getName();

    // Метод преобразования в строку с дефолтной реализацией
    default String getStringRepresentation() {
        return getName() + " — тип " + getContentType();

    }


    }

}
