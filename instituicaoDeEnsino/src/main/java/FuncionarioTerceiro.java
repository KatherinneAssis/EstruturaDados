public class FuncionarioTerceiro implements IPagamento{
    private String nome;
    private String matricula;
    private Integer qtdSalasHigienizadas;
    private Double valorPorSalaHigienizada;
    private Double bonus;


    public FuncionarioTerceiro(String nome, String matricula, int qtdSalasHigienizadas, Double valorPorSalaHigienizada, Double bonus) {
        this.nome = nome;
        this.matricula = matricula;
        this.qtdSalasHigienizadas = qtdSalasHigienizadas;
        this.valorPorSalaHigienizada = valorPorSalaHigienizada;
        this.bonus = bonus;
    }

    @Override
    public double pagamento() {
        return qtdSalasHigienizadas * valorPorSalaHigienizada;
    }

    @Override
    public double pagamentoFinal() {
        return pagamento() * bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getQtdSalasHigienizadas() {
        return qtdSalasHigienizadas;
    }

    public void setQtdSalasHigienizadas(int qtdSalasHigienizadas) {
        this.qtdSalasHigienizadas = qtdSalasHigienizadas;
    }

    public Double getValorPorSalaHigienizada() {
        return valorPorSalaHigienizada;
    }

    public void setValorPorSalaHigienizada(Double valorPorSalaHigienizada) {
        this.valorPorSalaHigienizada = valorPorSalaHigienizada;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return String.format("""
            Funcionário Terceiro
            Nome: %s
            Matricula: %s
            Valor por sala Higienizada: R$%.2f
            Valor SubValor: R$%.2f
            Valor final: R$%.2f
            """, getNome(), getMatricula(), getValorPorSalaHigienizada(), pagamento(), pagamentoFinal());
    }
}
