package br.com.digital.innovation;

import br.com.digital.innovation.utils.operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(3, 6));
    }
}
