package patterns.abstractFactory.scenario1.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created Windows Checkbox");
    }
}
