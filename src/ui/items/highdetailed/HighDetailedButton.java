package ui.items.highdetailed;

import ui.items.Button;
import ui.items.UIItem;

public class HighDetailedButton extends UIItem implements Button {

    public HighDetailedButton(int x, int y, String value) {
        setX(x);
        setY(y);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("High detailed button at (%d, %d) : %s", getX(), getY(), getValue());
    }

}
