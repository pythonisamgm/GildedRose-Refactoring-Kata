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
                         
        this.quality ++;
        this.sellIn --;
        if (this.quality >50){
            this.quality = 50;
        }
    }
    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
