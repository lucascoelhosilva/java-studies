package patterns.abstractFactory.scenario1.factory;

import patterns.abstractFactory.scenario1.buttons.Button;
import patterns.abstractFactory.scenario1.buttons.MacOsButton;
import patterns.abstractFactory.scenario1.checkbox.Checkbox;
import patterns.abstractFactory.scenario1.checkbox.MacOsCheckbox;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
