import java.util.Random;

public class Main{

    public static void main(String[] args){

        Recursao recursao = new Recursao();

        Random random = new Random();

        int vetor[] = new int[1000];


        for(int i = 0; i <= 999; i++ ){

            vetor[i] =  random.nextInt();
        }


        int inicio = 0;///vetor[0];

        //int fim = vetor[999];

        
        double start = System.currentTimeMillis();

        int maiorRec = recursao.rec(vetor, inicio);//, fim);

        double tempoFinal = System.currentTimeMillis() - start;

        System.out.println(tempoFinal); 
        System.out.println("Maior valor " +maiorRec);

        double start1 = System.currentTimeMillis();

        int maiorLaco = recursao.laco(vetor, inicio);//, fim);

        double tempoFinal1 = System.currentTimeMillis() - start1;

        System.out.println(tempoFinal1); 
        System.out.println("Maior valor " +maiorLaco);
        

    }
}


        
