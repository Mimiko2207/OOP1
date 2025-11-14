
package org.skypro.skyshop.product.org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    @Override
    public String toString() {
        return "";
    }

    private int price;

        public SimpleProduct(String name, int price) {
            super(name);
            if (price <= 0) {
                throw new IllegalArgumentException("Цена должна быть больше 0");
            }
            this.price = price;
        }

        @Override
        public int getPrice() {
            return price;
        }


    }

