import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Perfume extends Produto{
    private String fragrancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public double getValorProduto() {
        return getPreco() * 0.27;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public String toString() {
        return String.format("""
                Fragrância: %s
                """, getFragrancia());
    }
}
