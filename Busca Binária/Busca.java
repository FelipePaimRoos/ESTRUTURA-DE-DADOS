public class Busca {
    

    public void ordenar(int vetor[]){

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length-1; j++){
                if (vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public int buscaBinariaLaco(int vetor[], int numero){
        int inicio = 0;
        int fim = 999;
        int meio = 500;

        if(numero > vetor[meio]){
            for(int i = meio; i <= fim; i++){
                if(numero == vetor[i]){
                    return i;
            }
        }

        if(numero < vetor[meio]){
            for(int i = 0; i >= inicio; i--){
                if(numero == vetor[i]){
                    return i;
                }
            }
        }
    }
        return meio;
    }

        public int buscaBinariaRecursiva(int vetor[], int numero, int menor, int maior){
            int media = (maior + menor)/2;
            int meio = vetor[media];
            
            if(meio == numero){
                return meio;
            }
            else if(meio < numero){
                return buscaBinariaRecursiva(vetor, numero, media+1, maior);
            }
            else if(meio > numero){
                return buscaBinariaRecursiva(vetor, numero, menor, media-1);
            }else{
                return -1;
            }

        }
}
