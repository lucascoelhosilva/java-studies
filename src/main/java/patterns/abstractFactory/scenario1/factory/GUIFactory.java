package patterns.abstractFactory.scenario1.factory;

import patterns.abstractFactory.scenario1.buttons.Button;
import patterns.abstractFactory.scenario1.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
