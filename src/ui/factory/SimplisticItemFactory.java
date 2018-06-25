package ui.factory;

import ui.items.Button;
import ui.items.EditBox;
import ui.items.TextBox;

public class SimplisticItemFactory implements ItemFactory {

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public EditBox createEditBox() {
        return null;
    }

    @Override
    public TextBox createTextBox() {
        return null;
    }
}
