package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
    private static final int fixPrice = 100;
    public FixPriceProduct(String name, int fixPrice) {
        super(name);

    }

    @Override
    public boolean isSpecial() {
        return true; // фиксированная цена
    }
    @Override
    public String toString() {
        return "FixPriceProduct{продукт='" + getName() + "', цена=" + getPrice() + "}";
    }


    @Override
    public int getPrice() {
        return fixPrice;

        }
    }
