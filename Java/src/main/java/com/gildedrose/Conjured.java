package com.gildedrose;

public class Conjured {
    public String name;

    public int sellIn;

    public int quality;

    public Conjured(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    
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
