package patterns.strategy.scenario2;

public class Calc {

    // Pattern - utilizando POLIMORFISMO
    public double calcular(Calculadora calculadora){
        return calculadora.calcular();
    }
}
