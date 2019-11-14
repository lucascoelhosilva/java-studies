package patterns.strategy.tests;

import patterns.strategy.scenario1.CalculadoraDeImpostos;
import patterns.strategy.scenario1.ICMS;
import patterns.strategy.scenario1.IPI;

public class TesteScenario1 {
    public static void main(String[] args){
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        ICMS icms = new ICMS(100.00);
        IPI ipi = new IPI(100.00);

        System.out.println(calculadoraDeImpostos.calcular(icms));
        System.out.println(calculadoraDeImpostos.calcular(ipi));
    }
}
