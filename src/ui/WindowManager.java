package ui;

import config.ConfigManager;
import ui.store.FuturisticUIStore;
import ui.store.HighDetailedUIStore;
import ui.store.SimplisticUIStore;
import ui.store.UIStore;

public class WindowManager {

    // private design style
    private DesignStyle designStyle;

    // private WindowManager instance
    private static WindowManager instance = null;

    // private constructor
    private WindowManager(DesignStyle designStyle) {
        this.designStyle = designStyle;
    }

    // method for external instance calls
    // to preserve usage of single instance during runtime
    public static synchronized WindowManager getInstance(DesignStyle designStyle) {
        if (instance == null) {
            return new WindowManager(designStyle);
        }
        return instance;
    }

    // goes through the config
    //step by step and displays all UI items
    public void loadUI(ConfigManager config) {
        // get store
        UIStore store = null;
        // check design style
        switch (this.designStyle) {
            // simplistic design
            case SIMPLISTIC:
                store = new SimplisticUIStore();
                break;
            // high detailed design
            case HIGHDETAILED:
                store = new HighDetailedUIStore();
                break;
            // futuristic design
            case FUTURISTIC:
                store = new FuturisticUIStore();
                break;
        }

        // get design
        store.getDesign(config);
    }

}
