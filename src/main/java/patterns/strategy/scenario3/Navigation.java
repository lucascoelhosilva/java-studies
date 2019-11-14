package patterns.strategy.scenario3;

public class Navigation {
    public String buildRoute(RouteStrategy routeStrategy){
        return routeStrategy.route();
    }
}