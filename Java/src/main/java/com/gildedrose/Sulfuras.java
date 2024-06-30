package com.gildedrose;

public class Sulfuras extends NormalProduct{

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }
    @Override
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
