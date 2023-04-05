using System;
class HelloWorld {
  static void Main() {

    Aluno aluno1 = new Aluno("Felipe", 19, 10);

    Aluno aluno2 = new Aluno("teste", 20, 9);

    Aluno aluno3 = new Aluno("teste1", 25, 10);


    Vetor vetores = new Vetor();

    vetores.adicionarAluno(aluno1);
    vetores.adicionarAluno(aluno2);
    vetores.adicionarAluno(aluno3);

    System.Console.Write("O tamanho atual é " +vetores.tamanhoAtual() +"\n");

    System.Console.Write("É existente o aluno: "+vetores.contem(aluno1)+ "\n");

    System.Console.Write(vetores.cheio());
    
    vetores.remove(aluno1);
    
    System.Console.Write("É existente o aluno: "+vetores.contem(aluno1)+ "\n");
    
    System.Console.Write("O tamanho atual é " +vetores.tamanhoAtual() +"\n");
    
    System.Console.Write(vetores.detalhes(aluno3));

 //   System.Console.Write(vetores.relatorio());


  }
}
