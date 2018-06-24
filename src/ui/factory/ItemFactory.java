package ui.factory;

import ui.items.Button;
import ui.items.EditBox;
import ui.items.TextBox;

public interface ItemFactory {
    Button createButton();
    EditBox createEditBox();
    TextBox createTextBox();
}
