package com.gildedrose;

public class NormalProduct extends Item implements IUpdateQuality{


    public NormalProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }
    @Override
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
