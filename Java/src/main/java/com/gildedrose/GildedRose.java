package com.gildedrose;
//import com.gildedrose.NameProducts;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].quality < 0) {
                items[i].quality = 0;
            } else {
                if (items[i].name.equals("Aged Brie")) {

                    items[i].quality++;
                    items[i].sellIn--;
                    if (items[i].quality > 50) {
                        items[i].quality = 50;
                    }
                } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].sellIn < 6 && items[i].sellIn > 0) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 3;
                            items[i].sellIn--;

                        }
                    } else if (items[i].sellIn < 11 && items[i].sellIn > 5) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 2;
                            items[i].sellIn--;
                        }
                    } else if (items[i].sellIn > 11) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                            items[i].sellIn--;
                        }
                    } else if (items[i].sellIn <= 0) {
                        items[i].quality = 0;
                    }
                } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {

                    if (items[i].sellIn <= 0) {
                        items[i].quality = 80;
                    }

                } else if (items[i].name.startsWith("Conjured")) {
                    items[i].quality = items[i].quality - 2;
                    items[i].sellIn--;
                } else {

                    items[i].quality--;
                    items[i].sellIn--;
                    if (items[i].sellIn < 0) {
                        items[i].quality--;
                    }
                    if (items[i].quality < 0) {
                        items[i].quality = 0;
                    }

                }
            }
        }
    }
}
