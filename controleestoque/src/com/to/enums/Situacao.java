package com.to.enums;

public enum Situacao {

    /**
     * Situaçao para registros ainda pendentes de alteração
     */
    ABERTA(1, "Aberta"),
    /**
     * Situaçao para registros já finalizados
     */
    FINALIZADA(2, "Finalizada"),
    /**
     * Situaçao para registros cancelados durante o processo
     */
    CANCELADA(3, "Cancelada");

    private final int ID;
    private final String DESCRICAO;

    private Situacao(int id, String descricao) {
        this.ID = id;
        this.DESCRICAO = descricao;
    }

    public int getId() {
        return ID;
    }

    @Override
    public String toString() {
        return this.DESCRICAO;
    }
}
