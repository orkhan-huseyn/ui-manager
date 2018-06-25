package ui;

import ui.factory.ItemFactory;

public class FuturisticDesign extends Design {

    ItemFactory itemFactory;

    public FuturisticDesign(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public void init() {
        System.out.println("Initializing " + name + "...");
//        button = itemFactory.createButton();
//        editBox = itemFactory.createEditBox();
//        textBox = itemFactory.createTextBox();
    }

}
