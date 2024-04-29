public abstract class Membro implements IPagamento {
private String matricula;
private Double valorPorAula;

    public Membro(String matricula, Double valorPagamento) {
        this.matricula = matricula;
        this.valorPorAula = valorPagamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getValorPorAula() {
        return valorPorAula;
    }

    public void setValorPorAula(Double valorPorAula) {
        this.valorPorAula = valorPorAula;
    }

    @Override
    public String toString() {
        return String.format("""
                Numero de Mátricula: %s;
                Valor de pagamento: %.2f""", getMatricula(), getValorPorAula());
    }
}