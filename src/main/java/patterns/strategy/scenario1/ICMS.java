package patterns.strategy.scenario1;

public class ICMS implements Imposto {

    private double valor;

    public ICMS(double valor){
        this.valor = valor;
    }

    @Override
    public double calcular() {
        System.out.println("Calculando Imposto ICMS");
        return this.valor * 0.10;
    }
}
