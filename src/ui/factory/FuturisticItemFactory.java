package ui.factory;

import config.ConfigManager;
import config.LineItem;
import ui.items.UIItem;
import ui.items.futuristic.FuturisticButton;
import ui.items.futuristic.FuturisticEditBox;
import ui.items.futuristic.FuturisticTextBox;

import java.util.ArrayList;
import java.util.List;

public class FuturisticItemFactory extends ItemFactory {

    private ConfigManager configManager;

    public FuturisticItemFactory(ConfigManager configManager) {
        this.configManager = configManager;
    }

    public List<UIItem> getUIItems() {

        List<UIItem> uiItemList = new ArrayList<>();

        while (configManager.hasMoreItems()) {

            LineItem line = configManager.nextItem();

            UIItem item = null;

            switch (line.getNodeName()) {
                case "Button":
                    item = new FuturisticButton(line.getX(), line.getY(), line.getValue());
                    break;
                case "EditBox":
                    item = new FuturisticEditBox(line.getX(), line.getY(), line.getValue());
                    break;
                case "TextBox":
                    item = new FuturisticTextBox(line.getX(), line.getY(), line.getValue());
                    break;
            }

            uiItemList.add(item);

        }

        return uiItemList;
    }
}
