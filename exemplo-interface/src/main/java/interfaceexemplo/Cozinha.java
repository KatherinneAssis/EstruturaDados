package interfaceexemplo;

public class Cozinha implements IProcessarPedido{
    private String nomeChefe;

    public Cozinha(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    @Override
    public void processarPedido() {
        System.out.println(String.format("""
                Separando ingredientes...
                Montando prato...
                Pronto para entregar...
                """));
    }
}
