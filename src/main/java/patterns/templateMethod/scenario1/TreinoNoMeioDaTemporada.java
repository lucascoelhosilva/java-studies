package patterns.templateMethod.scenario1;

public class TreinoNoMeioDaTemporada extends Treino {
    @Override
    void preparoFisico() {
        System.out.println("Preparo fisico intenso");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo Treino com equipe reserva");
    }
}