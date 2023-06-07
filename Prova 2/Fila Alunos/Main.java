public class Main{
   public static void main(String[] args) {
     
        Aluno aluno1 = new Aluno("Felipe", 12);

        Aluno aluno2 = new Aluno("Matheus", 15);

        Aluno aluno3 = new Aluno("Fabio", 14);

        Fila fila = new Fila();

        Pilha pilha = new Pilha(fila.size());

        fila.add(aluno1);

        fila.add(aluno2);

        fila.add(aluno3);

        fila.imprimir();

        pilha.inverteFila(fila);

        fila.imprimir();
     



    }
}