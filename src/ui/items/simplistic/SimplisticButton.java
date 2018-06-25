package ui.items.simplistic;

import ui.items.Button;
import ui.items.UIItem;

public class SimplisticButton extends UIItem implements Button {

    SimplisticButton(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Simplistic button at (%d, %d) : %s", getX(), getY(), getValue());
    }
}
