package ui.items.highdetailed;

import ui.items.EditBox;
import ui.items.UIItem;

public class HighDetailedEditBox extends UIItem implements EditBox {

    HighDetailedEditBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("High detailed edit box at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
