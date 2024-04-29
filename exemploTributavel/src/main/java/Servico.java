public class Servico implements ITributavel {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getValorProduto() {
        return preco *0.12;
    }

    @Override
    public String toString() {
        return String.format("""
                Descrição: %s
                Preco: %.2f
                """, descricao, getValorProduto());
    }
}
