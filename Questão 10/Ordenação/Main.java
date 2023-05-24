

public class Main{

    public static void main(String[] args){

        Ordenar ordem = new Ordenar();
        
        int vetor[] = new int[6];

        vetor[0] = 3;
        vetor[1] = 7;
        vetor[2] = 1;
        vetor[3] = 4;
        vetor[4] = 9;
        vetor[5] = 2;

        
        System.out.println("BubbleShort: \n");
        ordem.bubbleShort(vetor);

        vetor[0] = 3;
        vetor[1] = 7;
        vetor[2] = 1;
        vetor[3] = 4;
        vetor[4] = 9;
        vetor[5] = 2;

        
        System.out.println("InsertionShort: \n");
        ordem.insertionShort(vetor);

        vetor[0] = 3;
        vetor[1] = 7;
        vetor[2] = 1;
        vetor[3] = 4;
        vetor[4] = 9;
        vetor[5] = 2;

        
        System.out.println("SelectionShort: \n");
        ordem.selectionShort(vetor);
 





        

    }
}