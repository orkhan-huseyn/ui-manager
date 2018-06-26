package ui.store;

import config.ConfigManager;
import ui.Design;
import ui.items.UIItem;

public abstract class UIStore {

    protected abstract Design createDesign(ConfigManager config);

    public Design getDesign(ConfigManager config) {
        Design design = createDesign(config);
        System.out.println("Making " + design.getName() + "....");
        design.init();
        System.out.println("With:");
        for (UIItem item: design.getUiItems()) {
            System.out.println(item.toString());
        }
        return design;
    }

}
