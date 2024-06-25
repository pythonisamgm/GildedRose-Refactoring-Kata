package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { 
        
        new Item("foo", 0, 0) };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("foo", app.items[0].name);
    }
    
    @Test
    void check_if_sellIn_date_below_0_quality_decreses_twice_as_fast(){
        Item[] items = new Item[] {
        
        new Item("+5 Dexterity Vest", 0, 20)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(18, app.items[0].quality);
    }
    @Test
    void check_if_quality_is_never_below_0(){
        Item[] items = new Item[] {
        
        new Item("+5 Dexterity Vest", 10, 0)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    @Test
    void check_if_dexterityVest_decreases_number_of_days(){
        Item[] items = new Item[] {
        
        new Item("+5 Dexterity Vest", 10, 20)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void check_if_dexterityVest_decreases_quality(){
        Item[] items = new Item[] {
        
        new Item("+5 Dexterity Vest", 10, 20)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(19, app.items[0].quality);
    }
    
    @Test
    void check_if_agedBrie_increases_quality(){
        Item[] items = new Item[] {
        
            new Item("Aged Brie", 2, 0)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(1, app.items[0].quality);
    }
    @Test
    void check_if_agedBrie_decreases_number_of_days(){
        Item[] items = new Item[] {
        
            new Item("Aged Brie", 2, 0)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
    }

   
    @Test
    void check_if_backStagePasses_increases_quality_by_1_if_sellIn_greater_10_days(){
        Item[] items = new Item[] {
        
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, app.items[0].quality);
    }
    
    @Test
    void check_if_backStagePasses_increases_quality_by_2_if_sellIn_between_6_and_10_days(){
        Item[] items = new Item[] {
        
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(51, app.items[0].quality);
    }
    @Test
    void check_if_backStagePasses_increases_quality_by_3_if_sellIn_between_1_and_5_days(){
        Item[] items = new Item[] {
        
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(52, app.items[0].quality);
    }
    @Test
    void check_if_backStagePasses_quality_is_0_if_sellIn_equals_0_days(){
        Item[] items = new Item[] {
        
        new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }
    @Test
    void check_if_quality_does_not_go_above_50(){
        Item[] items = new Item[] {
        
        new Item("Aged Brie", 2, 50)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, app.items[0].quality);
    }
    @Test
    void check_if_Sulfuras_sellIn_date_affects_quality_when_below_1(){
        Item[] items = new Item[] {
        
        new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(80, app.items[0].quality);
    }
    @Test
    void check_if_Sulfuras_quality_does_not_decrease_after_sellIn_date(){
        Item[] items = new Item[] {
        
        new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(80, app.items[0].quality);
    }

    @Test
    void check_if_conjured_items_degrades_twice_as_fast(){
        Item[] items = new Item[] {
        
            new Item("Conjured Mana Cake", 3, 6)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, app.items[0].quality);
    }
    @Test
    void check_if_conjured_items_degrades_twice_as_fast_if_sellIn_0(){
        Item[] items = new Item[] {
        
            new Item("Conjured Mana Cake", 0, 6)};
    
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, app.items[0].quality);
    }
}


