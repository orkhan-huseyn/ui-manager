package ui.store;

import config.ConfigManager;
import ui.Design;
import ui.HighDetailedDesign;
import ui.factory.HighDetailedItemFactory;
import ui.factory.ItemFactory;

public class HighDetailedUIStore extends UIStore {

    protected Design createDesign(ConfigManager config) {
        ItemFactory itemFactory = new HighDetailedItemFactory(config);
        Design design = new HighDetailedDesign(itemFactory);
        design.setName("High Detailed Design");
        return design;
    }
}
