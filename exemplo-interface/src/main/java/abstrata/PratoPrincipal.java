package abstrata;

public class PratoPrincipal extends itemMenu{

    private String diaSemana;

    @Override
    public void verDetalhes() {
        System.out.println(String.format("""
                O prato de %s é %s.
                """, diaSemana, getNome()));
    }

    public PratoPrincipal(String nome, Double preco, String diaSemana) {
        super(nome, preco);
        this.diaSemana = diaSemana;
    }

    public static final Double taxaPrato = 0.1;  //constante

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Double getTaxaPrato() {
        return taxaPrato;
    }
}
