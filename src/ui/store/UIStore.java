package ui.store;

import config.ConfigManager;
import ui.Design;

public abstract class UIStore {

    protected abstract Design createDesign(ConfigManager config);

    public Design getDesign(ConfigManager config) {
        Design design = createDesign(config);
        System.out.println("Making " + design.getName() + "....");
        design.init();
        return design;
    }

}
