package game;

public class Peça {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.posicao = null;
    }

}
