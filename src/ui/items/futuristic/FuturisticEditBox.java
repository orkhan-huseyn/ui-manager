package ui.items.futuristic;

import ui.items.EditBox;
import ui.items.UIItem;

public class FuturisticEditBox extends UIItem implements EditBox {

    FuturisticEditBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Futuristic edit box at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
