package ui.factory;

import ui.items.Button;
import ui.items.EditBox;
import ui.items.TextBox;
import ui.items.simplistic.SimplisticButton;
import ui.items.simplistic.SimplisticEditBox;
import ui.items.simplistic.SimplisticTextBox;

public class SimplisticItemFactory implements ItemFactory {

    public Button createButton(int x, int y, String value) {
        return new SimplisticButton(x, y, value);
    }

    public EditBox createEditBox(int x, int y, String value) {
        return new SimplisticEditBox(x, y, value);
    }

    public TextBox createTextBox(int x, int y, String value) {
        return new SimplisticTextBox(x, y, value);
    }
}
