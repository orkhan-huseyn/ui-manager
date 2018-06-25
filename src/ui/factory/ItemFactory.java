package ui.factory;

import ui.items.Button;
import ui.items.EditBox;
import ui.items.TextBox;

public interface ItemFactory {
    Button createButton(int x, int y, String value);
    EditBox createEditBox(int x, int y, String value);
    TextBox createTextBox(int x, int y, String value);
}
