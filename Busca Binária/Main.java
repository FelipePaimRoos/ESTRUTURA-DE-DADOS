import java.util.Random;

public class Main{

    public static void main(String[] args){

        Busca busca = new Busca();

        Random random = new Random();

        int vetor[] = new int [1000];

        for(int i = 0; i <= 999; i++){
            vetor[i] = random.nextInt();
        }

        busca.ordenar(vetor);

        int numero = vetor[999];

        double start = System.currentTimeMillis();
        
        int teste = busca.buscaBinariaLaco(vetor, numero);

        double tempoFinal = System.currentTimeMillis() - start;

        System.out.println("Resultado foi "+vetor[teste]+"\nE o tempo de execução foi "+tempoFinal);
        
        double Start = System.currentTimeMillis();

        int teste1 = busca.buscaBinariaRecursiva(vetor, numero, 0, 999);

        double TempoFinal = System.currentTimeMillis() - Start;

        System.out.println("Resultado foi "+teste1+"\nE o tempo de execução foi "+TempoFinal);

        
    }
}