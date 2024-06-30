package com.gildedrose;

public class AgedBrie extends NormalProduct{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }
    @Override
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
