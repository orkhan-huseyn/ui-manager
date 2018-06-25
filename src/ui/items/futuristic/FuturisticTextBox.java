package ui.items.futuristic;

import ui.items.Button;
import ui.items.UIItem;

public class FuturisticTextBox extends UIItem implements Button {

    public FuturisticTextBox(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Futuristic text box at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
