package ui;

import ui.factory.ItemFactory;

public class SimplisticDesign extends Design {

    ItemFactory itemFactory;

    public SimplisticDesign(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public void init() {
        System.out.println("Initializing " + name + "...");
        uiItems = itemFactory.getUIItems();
    }
}
