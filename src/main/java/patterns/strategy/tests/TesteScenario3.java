package patterns.strategy.tests;

import patterns.strategy.scenario3.Car;
import patterns.strategy.scenario3.Motorcicle;
import patterns.strategy.scenario3.Navigation;

public class TesteScenario3 {

    public static void main(String[] args){
        Navigation navigation = new Navigation();
        Car car = new Car("1230", "3030");
        Motorcicle motorcicle = new Motorcicle("1230", "3030");

        System.out.println(navigation.buildRoute(car));
        System.out.println(navigation.buildRoute(motorcicle));
    }
}
