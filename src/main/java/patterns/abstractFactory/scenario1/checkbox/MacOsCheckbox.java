package patterns.abstractFactory.scenario1.checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOsCheckbox");
    }
}
