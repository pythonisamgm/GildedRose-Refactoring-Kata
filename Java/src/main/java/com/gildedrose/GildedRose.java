package com.gildedrose;
//import com.gildedrose.NameProducts;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            
            if (!items[i].name.equals("Aged Brie")
            //UPDATE QUALITY
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert" )) {
                if (items[i].quality > 0) {
                    //if it normal and conjured
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                        if (items[i].name.startsWith("Conjured")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                }
            } else {
                //if it is aged and backstage
                if (items[i].quality < 50 ) {
                    
                    
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        //backstage
                        if (items[i].sellIn < 6 && items[i].sellIn > 0) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 2;
                            }
                        }
                        if (items[i].sellIn < 11 && items[i].sellIn > 5) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                    //backstage tickets and cheese 
                    } items[i].quality = items[i].quality + 1;
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros"))  {
                //UPDATE SELLIN value. 
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                //CUANDO SELLIN =0;
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                if (!items[i].name.startsWith("Conjured")) {
                                    items[i].quality --;
                                }
                                //Objetos regulares y conjurados= IF (SELLIN=0&&Q<0){Q=-1}
                                
                            }
                        }
                    } else {
                        //backstage: si sellIn<0
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    //aged brie UPDATE METHOD. 
                    if (items[i].quality < 50 ) {
                        items[i].quality ++;
                    }
                }
            }
        }
    }
}