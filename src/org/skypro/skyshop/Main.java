package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.org.skypro.skyshop.basket.Article;
import org.skypro.skyshop.product.org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.org.skypro.skyshop.basket.Searchable;


public class Main {
    public static void main(String[] args) {
        // Создаем корзину
        ProductBasket basket = new ProductBasket();
        basket.countSpecialProducts();
        // Создаем продукты
        Product product1 = new SimpleProduct("Молоко", 50);
        Product product2 = new DiscountedProduct("Хлеб", 30, 10);
        Product product3 = new FixPriceProduct("Яблоки", 10);
        Product product4 = new SimpleProduct("Сыр", 100);

        // 1. Добавление продукта в корзину
        basket.addProduct(product1);
        System.out.println("Добавлен продукт: " + product1.getName() + ": " + product1.getPrice() + " рублей.");

        // 2. Добавление продукта в заполненную корзину, в которой нет свободного места
        // В данном случае список не ограничен по размеру, поэтому добавляем еще один
        basket.addProduct(product2);
        System.out.println("Добавлен продукт: " + product2.getName() + ": " + product2.getPrice() + " рублей ( скидка " + product2.getPrice() + "% ).");

        // 3. Добавляем еще один товар
        basket.addProduct(product3);
        System.out.println("Добавлен продукт: " + product3.getName() + ": " + product3.getPrice() + " рублей. Фиксированная цена " + product3.getPrice() + " рублей.");

        // 4. Печать содержимого корзины
        System.out.println("Содержимое корзины:");
        basket.printContents();

        int specialCount = basket.countSpecialProducts();
        System.out.println("Количество товаров со скидкой или фиксированной ценой: " + specialCount);

        // 5. Получение стоимости корзины
        int totalPrice = basket.getTotalPrice();
        System.out.println("Общая стоимость корзины: " + totalPrice);


        // 6. Поиск товара, который есть в корзине
        String searchName1 = "Хлеб";
        System.out.println("Поиск товара '" + searchName1 + "': " + basket.containsProductByName(searchName1));

        // 7. Поиск товара, которого нет в корзине
        String searchName2 = "Масло";
        System.out.println("Поиск товара '" + searchName2 + "': " + basket.containsProductByName(searchName2));

        // 8. Очистка корзины
        basket.clear();
        System.out.println("Корзина очищена.");

        // 9. Печать содержимого пустой корзины
        System.out.println("Печать содержимого после очистки:");
        basket.printContents();

        // 10. Получение стоимости пустой корзины
        System.out.println("Стоимость пустой корзины: " + basket.getTotalPrice());

        // 11. Поиск товара по имени в пустой корзине
        System.out.println("Поиск товара 'Яблоки' в пустой корзине: " + basket.containsProductByName("Яблоки"));

            // Создаем движок поиска с размером массива 10
            SearchEngine searchEngine = new SearchEngine(10);

            // Создаем и добавляем товары
            Article product10 = new Article("Телевизор Samsung", "fuse");
            Article product20 = new Article("Ноутбук Dell", "fuze");
            Article product30 = new Article("Мышь Logitech", "fuze");
            searchEngine.add(product10);
            searchEngine.add(product20);
            searchEngine.add(product30);

            // Создаем и добавляем статьи
            Article article1 = new Article("Обзор смартфона", "Это подробный обзор смартфона...");
            Article article2 = new Article("Лучшие ноутбуки 2025", "Обзор лучших ноутбуков этого года...");
            searchEngine.add(article1);
            searchEngine.add(article2);

            // Выполняем поиск по разным строкам
            String[] searchTerms = {"Dell", "Обзор", "смартфон", "мышь", "2025"};

            for (String term : searchTerms) {
                System.out.println("Результаты поиска по: \"" + term + "\":");
                Searchable[] results = searchEngine.search(term);
                for (Searchable result : results) {
                    if (result != null) {
                        System.out.println(result.getStringRepresentation());
                    }
                }
                System.out.println();
            }
        }
    }