package ui.factory;

import config.ConfigManager;
import config.LineItem;
import ui.items.UIItem;
import ui.items.highdetailed.HighDetailedButton;
import ui.items.highdetailed.HighDetailedEditBox;
import ui.items.highdetailed.HighDetailedTextBox;

import java.util.ArrayList;
import java.util.List;

public class HighDetailedItemFactory extends ItemFactory {

    private ConfigManager configManager;

    public HighDetailedItemFactory(ConfigManager configManager) {
        this.configManager = configManager;
    }

    public List<UIItem> getUIItems() {

        List<UIItem> uiItemList = new ArrayList<>();

        while (configManager.hasMoreItems()) {

            LineItem line = configManager.nextItem();

            UIItem item = null;

            switch (line.getNodeName()) {
                case "Button":
                    item = new HighDetailedButton(line.getX(), line.getY(), line.getValue());
                    break;
                case "EditBox":
                    item = new HighDetailedEditBox(line.getX(), line.getY(), line.getValue());
                    break;
                case "TextBox":
                    item = new HighDetailedTextBox(line.getX(), line.getY(), line.getValue());
                    break;
            }

            uiItemList.add(item);

        }

        return uiItemList;
    }
}
