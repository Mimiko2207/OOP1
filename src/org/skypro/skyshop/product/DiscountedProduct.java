
package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double basePrice;
    public int discount;

    public DiscountedProduct(String name, double basePrice, int discount) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Базовая цена должна быть больше 0");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Процент скидки должен быть в диапазоне от 0 до 100");
        }
        this.basePrice = basePrice;
        this.discount = discount;
    }
    @Override
    public boolean isSpecial() {
        return true; // товар со скидкой
    }
    @Override
    public int getPrice() {
        return (int) (basePrice * (1 - discount / 100.00));

        }

        @Override
        public String toString() {
            return "DiscountedProduct{продукт='" + getName() + "', цена=" + getPrice() + ", скидка=" + discount + "%}";
        }
    }
