public class Main{

    public static void main(String[] ags){

        int vetor1[] = new int[5];

        int vetor2[] = new int[5];

        int vetor3[] = new int[10];

        for(int i = 0; i < 5; i++){
            vetor1[i] = i;
        }

        for(int i = 0; i < 5; i++){
            vetor2[i] = i+1;
        }

        for(int i = 0; i < vetor1.length; i++){
            for(int j = 0; j < vetor2.length; j++){
                if(vetor1[i] == vetor2[j]){
                    vetor3[i] = vetor1[i];
                    System.out.println("O valor "+vetor1[i]+" foi adicionado ao vetor Conjunto vetor3");
                }
            }
        }

    }
}