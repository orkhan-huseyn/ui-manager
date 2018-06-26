package ui.factory;

import config.ConfigManager;
import ui.items.UIItem;

import java.util.ArrayList;
import java.util.List;

public class SimplisticItemFactory extends ItemFactory {

    private ConfigManager configManager;

    public SimplisticItemFactory(ConfigManager configManager) {
        this.configManager = configManager;
    }

    public List<UIItem> getUIItems() {

        List<UIItem> uiItemList = new ArrayList<>();

        while (configManager.hasMoreItems()) {

            String line = configManager.nextItem();
            String[] arr = line.split(",");

        }

        return uiItemList;
    }
}
