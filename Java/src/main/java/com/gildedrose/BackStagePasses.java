package com.gildedrose;

public class BackStagePasses extends NormalProduct{

    public BackStagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    @Override
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

