package game;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private Integer linhas;

    private Integer colunas;

    private Peça[][] peças;

    public Tabuleiro(Integer linhas, Integer colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça[linhas][colunas];
    }

    public Integer getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }

    public Integer getColunas() {
        return colunas;
    }

    public void setColunas(Integer colunas) {
        this.colunas = colunas;
    }
}
