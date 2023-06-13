public class Main{
    public static void main(String[] args) {
        
        Mapa map = new Mapa();

        Aluno aluno = new Aluno(1, "Felipe", 20);

        Aluno aluno1 = new Aluno(33, "Bruno", 16);

        Aluno aluno2 = new Aluno(2 , "null", 10);

        map.put(1, aluno);

        map.put(33, aluno1);

        map.put(1, aluno2);

        map.imprimir();

        map.resize();
        
        map.imprimir();



    }
}