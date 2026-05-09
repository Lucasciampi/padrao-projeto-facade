package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class DepartamentoEmpresa {

    private List<Funcionario> funcionariosComPendencia = new ArrayList<Funcionario>();

    public void addFuncionarioPendente(Funcionario funcionario) {
        this.funcionariosComPendencia.add(funcionario);
    }

    public boolean verificarPendencia(Funcionario funcionario) {
        return this.funcionariosComPendencia.contains(funcionario);
    }

}
