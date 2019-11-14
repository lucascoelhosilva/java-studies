package patterns.strategy.scenario3;

public class Motorcicle implements RouteStrategy {

    private String pointA;
    private String pointB;

    public Motorcicle(String pointA, String pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }


    @Override
    public String route() {
        System.out.println("Calculating route for " + Motorcicle.class.getSimpleName());
        return this.pointA.concat(pointB);
    }
}
