package patterns.templateMethod.tests;

import patterns.templateMethod.scenario3.Generalization;
import patterns.templateMethod.scenario3.Specification;

public class TestsScenario3 {
    public static void main(String[] args){
        Generalization algorithm = new Specification();
        algorithm.findSolution();
    }
}
