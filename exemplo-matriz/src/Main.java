import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[4];
        int[][] matriz = new int[3][4];
        int[][] matrizComValoresIniciais = {{10,15,20,25},{30,35,40,45},{50,55,60,65}};

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Preencha a matriz em [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        System.out.println("*-----------------------------*");
        System.out.println("<-Matriz com valores iniciais->");
        exibirMatriz(matriz);
        System.out.println("*-----------------------------*");
        System.out.println("<---------Transposta---------->");
        exibirMatrizTransposta(matriz);
        System.out.println("*-----------------------------*");
    }


    // 1- Transforme o exibir em método
    public static void exibirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    // 2- Crie um método que exibe a matriz transposta
    public static void exibirMatrizTransposta(int[][] matriz) {
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}