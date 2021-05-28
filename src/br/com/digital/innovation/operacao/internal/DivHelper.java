package br.com.digital.innovation.operacao.internal;

import br.com.digital.innovation.operacao.Operacao;

public class DivHelper implements Operacao {

    @Override
    public int execute(int a, int b){
        return a / b;
    }
}
