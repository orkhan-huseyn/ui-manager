package ui.items.highdetailed;

import ui.items.TextBox;
import ui.items.UIItem;

public class HighDetailedTextBox extends UIItem implements TextBox {

    public HighDetailedTextBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("High detailed text box at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
