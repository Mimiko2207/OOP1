package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double basePrice;
    public int discount;

    public DiscountedProduct(String name, double basePrice, int discount) {
        super(name);
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
