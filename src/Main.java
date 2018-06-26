import config.ConfigManager;
import config.DefaultConfigManager;
import config.XMLConfigManager;
import ui.DesignStyle;
import ui.WindowManager;

public class Main {

    public static void main(String[] args) {

        WindowManager wm = WindowManager.getInstance(DesignStyle.SIMPLISTIC);
        ConfigManager config = new XMLConfigManager("config.xml");
        wm.loadUI(config);

    }
}
