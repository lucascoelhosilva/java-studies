package patterns.strategy.scenario2;

public class Subtracao implements Calculadora {

    private double valor1;
    private double valor2;
    private double total;

    public Subtracao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public double calcular() {
        return this.total = valor1 - valor2;
    }
}
