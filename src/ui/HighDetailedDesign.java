package ui;

import ui.factory.ItemFactory;

public class HighDetailedDesign extends Design {

    ItemFactory itemFactory;

    public HighDetailedDesign(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    void init() {
        System.out.println("Initializing " + name);
        button = itemFactory.createButton();
        editBox = itemFactory.createEditBox();
        textBox = itemFactory.createTextBox();
    }

}
