package com.gildedrose;

public class Conjured extends NormalProduct{

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn,quality);

    }

    @Override
    public void updateQuality(){
        this.quality = this.quality - 2;
        this.sellIn--;
        if (this.quality < 0) {
            this.quality = 0;
        }
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
