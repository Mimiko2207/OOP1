package org.skypro.skyshop.product.org.skypro.skyshop.basket;

import java.util.ArrayList;
import java.util.List;

import org.skypro.skyshop.product.Product;
public class ProductBasket {
    // Внутренний список продуктов
    private List<Product> products;


    // Конструктор
    public ProductBasket() {
        this.products = new ArrayList<>();
    }

    /**
     * Метод добавления продукта в корзину.
     * @param product продукт для добавления
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Метод получения общей стоимости корзины.
     * @return сумма стоимости всех товаров
     */
    public int getTotalPrice() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    /**
     * Метод, который печатает содержимое корзины.
     */
    public void printContents() {
        if (products.isEmpty() || allNulls()) {
            System.out.println("в корзине пусто");
            return;
        }
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + ": " + product.getPrice());
                total += product.getPrice();
            }
        }
        System.out.println("Итого: " + total);
    }

    /**
     * Проверяет наличие продукта по имени.
     * @param name имя продукта
     * @return true, если продукт есть, иначе false
     */
    public boolean containsProductByName(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Очищает корзину, присваивая всем элементам null.
     */
    public void clear() {
        for (int i = 0; i < products.size(); i++) {
            products.set(i, null);
        }
    }

    /**
     * Вспомогательный метод для проверки, все ли элементы null.
     * @return true, если все null, иначе false
     */
    private boolean allNulls() {
        for (Product product : products) {
            if (product != null) {
                return false;
            }
        }
        return true;
    }
}
