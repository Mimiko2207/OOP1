package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.org.skypro.skyshop.basket.ProductBasket;

public class Main {
    public static void main(String[] args) {
        // Создаем корзину
        ProductBasket basket = new ProductBasket();

        // Создаем продукты
        Product product1 = new Product("Молоко", 50);
        Product product2 = new Product("Хлеб", 30);
        Product product3 = new Product("Яблоки", 20);
        Product product4 = new Product("Сыр", 100);

        // 1. Добавление продукта в корзину
        basket.addProduct(product1);
        System.out.println("Добавлен продукт: " + product1.getName());

        // 2. Добавление продукта в заполненную корзину, в которой нет свободного места
        // В данном случае список не ограничен по размеру, поэтому добавляем еще один
        basket.addProduct(product2);
        System.out.println("Добавлен продукт: " + product2.getName());

        // 3. Добавляем еще один товар
        basket.addProduct(product3);
        System.out.println("Добавлен продукт: " + product3.getName());

        // 4. Печать содержимого корзины
        System.out.println("\nСодержимое корзины:");
        basket.printContents();

        // 5. Получение стоимости корзины
        int totalPrice = basket.getTotalPrice();
        System.out.println("\nОбщая стоимость корзины: " + totalPrice);

        // 6. Поиск товара, который есть в корзине
        String searchName1 = "Хлеб";
        System.out.println("\nПоиск товара '" + searchName1 + "': " + basket.containsProductByName(searchName1));

        // 7. Поиск товара, которого нет в корзине
        String searchName2 = "Масло";
        System.out.println("Поиск товара '" + searchName2 + "': " + basket.containsProductByName(searchName2));

        // 8. Очистка корзины
        basket.clear();
        System.out.println("Корзина очищена.");

        // 9. Печать содержимого пустой корзины
        System.out.println("\nПечать содержимого после очистки:");
        basket.printContents();

        // 10. Получение стоимости пустой корзины
        System.out.println("\nСтоимость пустой корзины: " + basket.getTotalPrice());

        // 11. Поиск товара по имени в пустой корзине
        System.out.println("Поиск товара 'Яблоки' в пустой корзине: " + basket.containsProductByName("Яблоки"));
    }
}