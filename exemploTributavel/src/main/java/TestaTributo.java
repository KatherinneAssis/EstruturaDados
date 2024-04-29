public class TestaTributo {
    public static void main(String[] args) {
        Alimento alimentoA = new Alimento(12, "AAAAAAAA LASANHAAAA", 50.0, 30);
        Perfume perfumeB = new Perfume(1,"Perfuminhoooo", 20.0, "Baunilha");
        Servico servicoC = new Servico("Ai Conserto", 500.0);
        Tributo tributo = new Tributo();

        tributo.adicionaTributavel(alimentoA);
        tributo.adicionaTributavel(perfumeB);
        tributo.adicionaTributavel(servicoC);

        System.out.println(tributo.calculaTotalTributo());
        tributo.exibeTodos();
    }
}