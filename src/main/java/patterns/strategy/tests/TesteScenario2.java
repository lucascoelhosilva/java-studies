package patterns.strategy.tests;

import patterns.strategy.scenario2.Adicao;
import patterns.strategy.scenario2.Calc;
import patterns.strategy.scenario2.Subtracao;

public class TesteScenario2 {

    public static void main(String[] args) {
        Calc calc = new Calc();
        Adicao adicao = new Adicao(2, 2);
        Subtracao subtracao = new Subtracao(5, 2);

        System.out.println(calc.calcular(adicao));
        System.out.println(calc.calcular(subtracao));
    }
}
