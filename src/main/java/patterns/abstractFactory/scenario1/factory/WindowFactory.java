package patterns.abstractFactory.scenario1.factory;

import patterns.abstractFactory.scenario1.buttons.Button;
import patterns.abstractFactory.scenario1.buttons.WindowsButton;
import patterns.abstractFactory.scenario1.checkbox.Checkbox;
import patterns.abstractFactory.scenario1.checkbox.WindowsCheckbox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
