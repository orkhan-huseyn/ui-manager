package ui.items.simplistic;

import ui.items.TextBox;
import ui.items.UIItem;

public class SimplisticTextBox extends UIItem implements TextBox {

    public SimplisticTextBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Simplistic edit box at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
