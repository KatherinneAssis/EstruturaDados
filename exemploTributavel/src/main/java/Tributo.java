import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tributo {
    ArrayList<ITributavel> listaTrib;

    public Tributo() {
        listaTrib = new ArrayList<>();
    }

    public void adicionaTributavel(ITributavel t){
        listaTrib.add(t);
    }
    public double calculaTotalTributo(){
        double valorTotal = 0.0;
        for (ITributavel t : listaTrib) {
            valorTotal += t.getValorProduto();
        }
        return valorTotal;
    }
    public void exibeTodos(){
        listaTrib.forEach(System.out::println);
    }
}
