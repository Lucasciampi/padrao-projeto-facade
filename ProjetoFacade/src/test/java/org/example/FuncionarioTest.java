package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPendenciaTIDesligamento() {
        Funcionario funcionario = new Funcionario();
        TI.getInstancia().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarPendenciaRHDesligamento() {
        Funcionario funcionario = new Funcionario();
        RecursosHumanos.getInstancia().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroDesligamento() {
        Funcionario funcionario = new Funcionario();
        Financeiro.getInstancia().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarFuncionarioSemPendenciaDesligamento() {
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.desligar());
    }

}