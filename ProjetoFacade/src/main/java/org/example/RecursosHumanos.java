package org.example;

public class RecursosHumanos extends DepartamentoEmpresa {

    private static RecursosHumanos recursosHumanos = new RecursosHumanos();

    private RecursosHumanos() {};

    public static RecursosHumanos getInstancia() {
        return recursosHumanos;
    }
}
