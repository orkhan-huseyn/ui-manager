package ui.store;

import config.ConfigManager;
import ui.Design;
import ui.SimplisticDesign;
import ui.factory.ItemFactory;
import ui.factory.SimplisticItemFactory;

public class SimplisticUIStore extends UIStore {

    protected Design createDesign(ConfigManager config) {
        ItemFactory itemFactory = new SimplisticItemFactory(config);
        Design design = new SimplisticDesign(itemFactory);
        design.setName("Simplistic Design");
        return design;
    }
}
