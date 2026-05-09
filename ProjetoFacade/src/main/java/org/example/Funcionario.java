package org.example;

public class Funcionario {

    public boolean desligar() {
        return DesligamentoFacade.verificarPendenciasDesligamento(this);
    }

}
