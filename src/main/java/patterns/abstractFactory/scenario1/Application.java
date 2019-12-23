package patterns.abstractFactory.scenario1;

import patterns.abstractFactory.scenario1.buttons.Button;
import patterns.abstractFactory.scenario1.checkbox.Checkbox;
import patterns.abstractFactory.scenario1.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}