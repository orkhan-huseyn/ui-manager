package ui;

import ui.items.Button;
import ui.items.EditBox;
import ui.items.TextBox;

public abstract class Design {

    // name for showing on console
    String name;
    // concrete ui items will be decided by subclasses
    // general button
    Button button;
    // general edit box
    EditBox editBox;
    // general text box
    TextBox textBox;

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
