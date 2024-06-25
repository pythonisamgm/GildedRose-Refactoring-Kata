package com.gildedrose;

public class Sulfuras {
    public String name;

    public int sellIn;

    public int quality;

    public Sulfuras(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    public void updateQuality(){
    if (this.sellIn <= 0) {
        this.quality = 80;
    }
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
