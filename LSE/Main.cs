public class main{

    public static void Main(){

        LSE lista = new LSE();

        Aluno aluno1 = new Aluno("Felipe", 19);
        Aluno aluno2 = new Aluno ("Epilef", 91);

        lista.insereInicio(aluno1);
        lista.insereInicio(aluno2);
        
      //  System.Console.Write(lista.relatorio());

        lista.relatorio();
        

       // System.Console.Write(noh.Item);

      //  System.Console.Write(aluno1.NOME);
        
        

            
        
    }
}