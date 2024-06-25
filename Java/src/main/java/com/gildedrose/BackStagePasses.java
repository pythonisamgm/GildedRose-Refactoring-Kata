package com.gildedrose;

public class BackStagePasses {
    public String name;

    public int sellIn;

    public int quality;

    public BackStagePasses(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality(){
    if (this.sellIn < 6 && this.sellIn > 0) {
        if (this.quality < 50) {
            this.quality = this.quality + 3;
            this.sellIn--;

        }
    } else if (this.sellIn < 11 && this.sellIn > 5) {
        if (this.quality < 50) {
            this.quality = this.quality + 2;
            this.sellIn--;
        }
    } else if (this.sellIn > 11) {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
            this.sellIn--;
        }
    } else if (this.sellIn <= 0) {
        this.quality = 0;
    }
}
}

