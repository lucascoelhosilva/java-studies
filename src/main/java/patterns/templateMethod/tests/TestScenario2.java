package patterns.templateMethod.tests;

import patterns.templateMethod.scenario2.Facebook;
import patterns.templateMethod.scenario2.Network;
import patterns.templateMethod.scenario2.Twitter;

import java.io.IOException;

public class TestScenario2 {
    public static void main(String[] args) throws IOException {

        Network network = null;
        String userName = "Lucas";
        String password = "123";
        String message = "Message Test";

//        network = new Facebook(userName, password);
        network = new Twitter(userName, password);
        network.post(message);
    }
}
