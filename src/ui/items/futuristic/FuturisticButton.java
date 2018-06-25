package ui.items.futuristic;

import ui.items.Button;
import ui.items.UIItem;

public class FuturisticButton extends UIItem implements Button {

    FuturisticButton(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Futuristic button at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
