package ui.items.simplistic;

import ui.items.EditBox;
import ui.items.UIItem;

public class SimplisticEditBox extends UIItem implements EditBox {

    public SimplisticEditBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Simplistic edit box at (%d, %d) : %s", getX(), getY(), getValue());
    }
}
