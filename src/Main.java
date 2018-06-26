import config.ConfigManager;
import config.DefaultConfigManager;
import config.XMLConfigManager;
import ui.DesignStyle;
import ui.WindowManager;

public class Main {

    public static void main(String[] args) {

        // single WindowManager class instance
        WindowManager wm = WindowManager.getInstance(DesignStyle.SIMPLISTIC);
        // default config manager
        ConfigManager defaultConfigManager = new DefaultConfigManager("config.txt");
        // xml config manager
        ConfigManager xmlConfigManager = new XMLConfigManager("config.xml");
        // load UI method, accepting any type of config manager
        wm.loadUI(defaultConfigManager);
    }
}
