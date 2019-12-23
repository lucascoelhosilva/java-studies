package patterns.templateMethod.scenario1;

public class TreinoNoInicioDaTemporada extends Treino {
    @Override
    void preparoFisico() {
        System.out.println("Preparo fisico leve");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo Treino com equipe junior");
    }
}
