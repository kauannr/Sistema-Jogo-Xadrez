package program;

public class posicao {
    private Integer linha;
    private Integer coluna;

    public posicao(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public void setValores(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public String toString() {
        return getLinha() + ", " + getColuna();
    }

    public Integer getLinha() {
        return linha;
    }

    public Integer getColuna() {
        return coluna;
    }
}
