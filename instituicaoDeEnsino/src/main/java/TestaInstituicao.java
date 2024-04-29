public class TestaInstituicao {
    public static void main(String[] args) {
        Professor professor01 = new Professor("13", 100.0, "Taylor Swift", 30.0, 2);
        Aluno aluno01 = new Aluno("444", 55.0, "Katherinne Assis", 10.0, 40);
        FuncionarioTerceiro limpeza = new FuncionarioTerceiro("Kayne West","B54864", 5, 20.0, 20.0);

        System.out.println(professor01);
        System.out.println(aluno01);
        System.out.println(limpeza);
    }
}