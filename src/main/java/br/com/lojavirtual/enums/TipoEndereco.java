package br.com.lojavirtual.enums;

public enum TipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("Entrega");


    public String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
