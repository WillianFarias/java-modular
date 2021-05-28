package br.com.digital.innovation.utils.operacao;

import br.com.digital.innovation.utils.operacao.internal.DivHelper;
import br.com.digital.innovation.utils.operacao.internal.MultHelper;
import br.com.digital.innovation.utils.operacao.internal.SubHelper;
import br.com.digital.innovation.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper diviHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        diviHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return diviHelper.execute(a, b);
    }
}
