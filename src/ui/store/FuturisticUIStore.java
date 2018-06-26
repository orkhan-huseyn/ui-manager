package ui.store;

import config.ConfigManager;
import ui.Design;
import ui.FuturisticDesign;
import ui.factory.FuturisticItemFactory;
import ui.factory.ItemFactory;

public class FuturisticUIStore extends UIStore {

    protected Design createDesign(ConfigManager config) {
        ItemFactory itemFactory = new FuturisticItemFactory(config);
        Design design = new FuturisticDesign(itemFactory);
        design.setName("Futuristic Design");
        return design;
    }
}
