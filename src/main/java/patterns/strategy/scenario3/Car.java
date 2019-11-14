package patterns.strategy.scenario3;

public class Car implements RouteStrategy {

    private String pointA;
    private String pointB;

    public Car(String pointA, String pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public String route() {
        System.out.println("Calculating route for " + Car.class.getSimpleName());
        return this.pointA.concat(this.pointB);
    }
}
