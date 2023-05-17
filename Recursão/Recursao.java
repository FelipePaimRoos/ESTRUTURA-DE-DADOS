public class Recursao{
    int maior;
    int max2;

    public int rec(int vetor[], int inicio){
        if(vetor.length == inicio) return maior;

        if(maior < vetor[inicio])
            maior = vetor[inicio];
        
        if(inicio == vetor.length-1){
            return maior;
        }
        return rec(vetor,inicio+1);

        //if(inicio == fim){

        //    return vetor[inicio];
        //}else {

        //int meio = (inicio + fim)/2;

        //max1 = rec(vetor, inicio, meio);

        //max2 = rec(vetor, meio+1, fim); 

        //if (max1 > max2){
        //    return max1;
        //}else{
        //    return max2;
        //}
        //}

    }

    public int laco(int vetor[], int inicio){
        int maior = 0;

        for(int i = 0; i < vetor.length; i++){
            if(maior < vetor[i]){
                maior = vetor[i];
            }
            
        }
        return maior;
    }
}





    

        
