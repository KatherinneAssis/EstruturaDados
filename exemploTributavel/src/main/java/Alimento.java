public class Alimento extends Produto {
    private Integer quantVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    @Override
    public double getValorProduto() {
        return getPreco() * 0.15;
    }

    public Integer getQuantVitamina() {
        return quantVitamina;
    }

    public void setQuantVitamina(Integer quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    @Override
    public String toString() {
        return String.format("""
                Quantidade de vitaminas: %s
                """, getQuantVitamina());
    }
}
