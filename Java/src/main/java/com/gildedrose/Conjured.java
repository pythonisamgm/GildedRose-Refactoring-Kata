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
        this.sellIn =-1;
        this.quality =-2;
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
