package edu.projetos_basico.conversor_moedas;

public class ConversorMoeda {
    // R$ 1.00 == $5.40

    public double realForDollar(double real) {
        return real * 0.19;
    }

    public double dollarForReal(double dollar) {
        return dollar * 5.40;
    }
}
