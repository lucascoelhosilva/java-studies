package patterns.templateMethod.scenario3;

public class Specification extends Generalization {

    @Override
    void stepTwo() {
        System.out.println("Specification.stepTwo");
    }

    @Override
    void stepThr() {
        System.out.println("Specification.stepThree");
    }

    protected void stepFor() {
        System.out.println("Specification.stepFor");
        super.stepFor();
    }
}
