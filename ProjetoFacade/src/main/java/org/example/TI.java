package org.example;

public class TI extends DepartamentoEmpresa {

    private static TI ti = new TI();

    private TI() {
    };

    public static TI getInstancia() {
        return ti;
    }

}
