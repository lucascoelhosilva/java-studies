package patterns.abstractFactory.scenario1.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have create Windows Button");
    }
}
