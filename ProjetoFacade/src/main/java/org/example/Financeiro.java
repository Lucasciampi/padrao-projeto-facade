package org.example;

public class Financeiro extends DepartamentoEmpresa {

    private static Financeiro financeiro = new Financeiro();

    private Financeiro() {};

    public static Financeiro getInstancia() {
        return financeiro;
    }
}
