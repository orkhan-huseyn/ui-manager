package ui;

import config.ConfigManager;

public class WindowManager {

    // private WindowManager instance
    private static WindowManager instance = null;

    // private constructor
    private WindowManager() { }

    // method for external instance calls
    // to preserve usage of single instance during runtime
    public static synchronized WindowManager getInstance() {
        if (instance == null) {
            return new WindowManager();
        }
        return instance;
    }

    // goes through the config
    //step by step and displays all UI items
    public void loadUI(ConfigManager config) {
        //
    }

}
