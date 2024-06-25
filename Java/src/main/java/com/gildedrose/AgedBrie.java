package com.gildedrose;

public class AgedBrie {
    public String name;

    public int sellIn;

    public int quality;

    public AgedBrie(String name, int sellIn, int quality) {
        this.name = "Aged Brie";
        this.sellIn = sellIn;
        this.quality = quality;
    }
    public void updateQuality(){
        if (this.sellIn<50){}
            this.sellIn =-1;
            this.quality =-2;
    }
    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
