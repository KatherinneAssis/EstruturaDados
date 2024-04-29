package abstrata;
// atributos, construtor, metodos da classe, get e set, toString
public abstract class itemMenu {
    private String nome;
    private Double preco;

    public itemMenu(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void verDetalhes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
