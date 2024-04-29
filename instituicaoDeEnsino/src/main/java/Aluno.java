public class Aluno extends Membro{

    private String nomeAluno;
    private Double bolsaEstudos;
    private Integer aulasAssistidas;

    public Aluno(String matricula, Double valorPagamento, String nomeAluno, Double bolsaEstudos, Integer aulasAssistidas) {
        super(matricula, valorPagamento);
        this.nomeAluno = nomeAluno;
        this.bolsaEstudos = bolsaEstudos;
        this.aulasAssistidas = aulasAssistidas;
    }

    @Override
    public double pagamento() {
        return getValorPorAula() * getAulasAssistidas();
    }

    @Override
    public double pagamentoFinal() {
        return pagamento() - bolsaEstudos;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getBolsaEstudos() {
        return bolsaEstudos;
    }

    public void setBolsaEstudos(Double bolsaEstudos) {
        this.bolsaEstudos = bolsaEstudos;
    }

    public Integer getAulasAssistidas() {
        return aulasAssistidas;
    }

    public void setAulasAssistidas(Integer aulasAssistidas) {
        this.aulasAssistidas = aulasAssistidas;
    }

    @Override
    public String toString() {
        return String.format("""
               Aluno: %s,
               %s
               Auxilio Bolsa: %.2f
               Aulas Assistidas: %d
               SubTotal: %.2f
               Total: %.2f
                """, getNomeAluno(), super.toString(), getBolsaEstudos(), getAulasAssistidas(), pagamento(), pagamentoFinal());
    }
}