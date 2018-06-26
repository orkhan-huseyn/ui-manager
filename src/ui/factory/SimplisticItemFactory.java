package ui.factory;

import config.ConfigManager;
import config.LineItem;
import ui.items.UIItem;
import ui.items.simplistic.SimplisticButton;
import ui.items.simplistic.SimplisticEditBox;
import ui.items.simplistic.SimplisticTextBox;

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

            LineItem line = configManager.nextItem();

            UIItem item = null;

            switch (line.getNodeName()) {
                case "Button":
                    item = new SimplisticButton(line.getX(), line.getY(), line.getValue());
                    break;
                case "EditBox":
                    item = new SimplisticEditBox(line.getX(), line.getY(), line.getValue());
                    break;
                case "TextBox":
                    item = new SimplisticTextBox(line.getX(), line.getY(), line.getValue());
                    break;
            }

            uiItemList.add(item);

        }

        return uiItemList;
    }
}
