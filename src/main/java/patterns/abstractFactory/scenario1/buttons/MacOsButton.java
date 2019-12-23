package patterns.abstractFactory.scenario1.buttons;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOsButton");
    }
}
