package org.example;

public class DesligamentoFacade {

    public static boolean verificarPendenciasDesligamento(Funcionario funcionario) {
        if (RecursosHumanos.getInstancia().verificarPendencia(funcionario)) {
            return false;
        }
        if (TI.getInstancia().verificarPendencia(funcionario)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarPendencia(funcionario)) {
            return false;
        }
        return true;
    }

}
