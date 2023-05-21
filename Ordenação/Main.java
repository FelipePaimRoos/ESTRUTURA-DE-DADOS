import java.util.Random;

public class Main{

    public static void main(String[] args){

        double start;
        double tempoFinal;

        Ordenar ordena = new Ordenar();

        Random random = new Random();

        int vetor1[] = new int [1000];

        for(int i = 0; i <= 999; i++){
            vetor1[i] = random.nextInt();
        }

        start = System.currentTimeMillis();

        ordena.bubbleShort(vetor1);

        tempoFinal = System.currentTimeMillis() - start;

        System.out.println("Tempo de execução do BubbleShort: "+tempoFinal);


        for(int i = 0; i <= 999; i++){
            vetor1[i] = random.nextInt();
        }

        start = System.currentTimeMillis();

        ordena.selectionShort(vetor1);

        tempoFinal = System.currentTimeMillis() - start;

        System.out.println("Tempo de execução do SelectionShort: "+tempoFinal);

        for(int i = 0; i <= 999; i++){
            vetor1[i] = random.nextInt();
        }
        
        start = System.currentTimeMillis();

        ordena.insertionShort(vetor1);

        tempoFinal = System.currentTimeMillis() - start;

        System.out.println("Tempo de execução do InsertionShort: "+tempoFinal);



        

    }
}