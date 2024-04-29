public class ExemploVetor {

    public static void exibirVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("vetor");


        }


    }

    public static void main(String[] args) {

        //Criando um vetor
        int[] vetor = new int[5];

        //Recuperando um elemento

        int terceiroNumero = vetor[2];

        // Alterar um vetor
        vetor[2] = 42;


        int[] vetor02 = {10,20,30,40,50,60};

        for (int i = 0; i < vetor02.length; i++) {

            System.out.println("vetor02");
            exibirVetor(vetor02);
        }

    }
}
