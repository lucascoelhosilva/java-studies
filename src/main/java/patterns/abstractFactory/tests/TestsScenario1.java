package patterns.abstractFactory.tests;

import patterns.abstractFactory.scenario1.Application;
import patterns.abstractFactory.scenario1.factory.GUIFactory;
import patterns.abstractFactory.scenario1.factory.MacOsFactory;
import patterns.abstractFactory.scenario1.factory.WindowFactory;

public class TestsScenario1 {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        } else {
            factory = new WindowFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}