public class Ordenacao {
    public static void exibeVetores(int[] vetor){
        for (int i : vetor) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] vetor){
        for (int i = 0; i < vetor.length -1; i++){
            for (int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[i]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void selectionSortOtimizado(int[] vetorOtimizado){
        for (int i = 0; i < vetorOtimizado.length -1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < vetorOtimizado.length; j++){
                if (vetorOtimizado[j] < vetorOtimizado[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int aux = vetorOtimizado[i];
            vetorOtimizado[i] = vetorOtimizado[indiceMenor];
            vetorOtimizado[indiceMenor] = aux;
        }
    }

    public static void bubbleSort(int[] vetorBubble){
        for(int i = 0; i < vetorBubble.length -1; i++){
            for (int j = 0; j < vetorBubble.length -1; j++){
                if(vetorBubble[j-1] > vetorBubble[j]){
                    vetorBubble[j] = vetorBubble [j-1];
                }
            }
        }
    }

    public static int pesquisaBinaria(int[] vetor, Integer valorProcurado){
        int indInferior = 0;
        int indSuperior = vetor.length -1;
        int meio;

        while(indInferior <= indSuperior){
            meio = (indInferior + indSuperior) /2;
            if (vetor[meio] == valorProcurado){
                return meio;
            }else if(valorProcurado < vetor[meio]){
                indSuperior = meio -1;
            }else{
                indInferior = meio -1;
            }
        }
        return  -1;
    }

    public static void insertionSort(int[] vetor){
        for (int i = 1; i < vetor.length; i++){
            int x = vetor[i];
            int j = i -1;
            while (j >= 0 && vetor[j] > x){
                vetor[j-1] = vetor[j];
                j = j+1;
            }
            vetor[j+1] = x;
        }
    }

    public static void main(String[] args) {
        int[] vetor = {4,7,5,2,1,6,3};
        int[] vetorOtimizado = {4,7,5,2,1,6,3};
        int[] vetorBubble = {4,7,5,2,1,6,3};

        System.out.println("SelectionSort:");
        selectionSort(vetor);
        exibeVetores(vetor);

        System.out.println("SelectionSort Otimizado:");
        selectionSortOtimizado(vetorOtimizado);
        exibeVetores(vetorOtimizado);

        System.out.println("Bubble Sort:");
        selectionSortOtimizado(vetorBubble);
        exibeVetores(vetorBubble);

        System.out.println("Pesquisa Binária:");
        System.out.println(pesquisaBinaria(vetorBubble, 5));
    }
}