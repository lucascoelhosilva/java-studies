package patterns.strategy.scenario1;

import patterns.strategy.scenario1.Imposto;

public class IPI implements Imposto {

    private double valor;

    public IPI(double valor){
        this.valor = valor;
    }

    @Override
    public double calcular() {
        System.out.println("Calculando Imposto IPI");
        return this.valor * 0.20;
    }
}