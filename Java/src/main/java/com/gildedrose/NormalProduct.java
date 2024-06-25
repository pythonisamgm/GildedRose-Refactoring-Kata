package com.gildedrose;

public class NormalProduct {
    public String name;

    public int sellIn;

    public int quality;

    public NormalProduct(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {

        this.quality--;
        this.sellIn--;
        if (this.sellIn < 0) {
            this.quality--;
        }
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
