package ui;

import ui.items.UIItem;
import java.util.List;

public abstract class Design {

    // name for showing on console
    String name;
    // concrete ui items will be decided by subclasses
    List<UIItem> uiItems;

    // should be implemented by subclasses
    // initializes specified UI style
    public abstract void init();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
