public class Ordenar {
    
    public void bubbleShort(int vetor[]){

    for (int i = 0; i < vetor.length; i++)
        for (int j = 0; j < vetor.length-1; j++)
            if (vetor[j] > vetor[j+1]) {
            int aux = vetor[j];
            vetor[j] = vetor[j+1];
            vetor[j+1] = aux;
        }
    }

    public void selectionShort(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
                for (int j = i+1; j < vetor.length; j++)
                    if (vetor[j] < vetor[menor])
                    menor = j;
                    int aux = vetor[i];
                    vetor[i] = vetor[menor];
                    vetor[menor] = aux;
            }
            
    }

    public void insertionShort(int vetor[]){

        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

                while (j >= 0 && chave < vetor[j]) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
                    vetor[j + 1] = chave;
            }
    }
}
