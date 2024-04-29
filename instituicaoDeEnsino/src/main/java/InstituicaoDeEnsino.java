import java.util.ArrayList;

public class InstituicaoDeEnsino {

    ArrayList<IPagamento> listaPagamentos;


    public InstituicaoDeEnsino() {
        this.listaPagamentos = new ArrayList<>();
    }

    public void adicionaPagamento(IPagamento p){
        listaPagamentos.add(p);
    }


}