public class Professor extends Membro {

    private String nomeProfessor;
    private Double bonificacao;
    private Integer aulasMestradas;

    public Professor(String matricula, Double valorPagamento, String nomeProfessor, Double bonificacao, Integer aulasMestradas) {
        super(matricula, valorPagamento);
        this.nomeProfessor = nomeProfessor;
        this.bonificacao = bonificacao;
        this.aulasMestradas = aulasMestradas;
    }

    @Override
    public double pagamento() {
        return getValorPorAula() * aulasMestradas;
    }

    @Override
    public double pagamentoFinal() {
        return pagamento() * bonificacao;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Integer getAulasMestradas() {
        return aulasMestradas;
    }

    public void setAulasMestradas(Integer aulasMestradas) {
        this.aulasMestradas = aulasMestradas;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome Professor: %s
                %s
                Bonificação: %.2f
                Aulas Mestradas: %d
                SubSalário: %.2f
                Sálario: %.2f
                """, getNomeProfessor(), super.toString(), getBonificacao(), aulasMestradas, pagamento(),pagamentoFinal());
    }
}