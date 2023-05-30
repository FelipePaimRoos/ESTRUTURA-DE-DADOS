/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
using System;
class HelloWorld {
  static void Main() {
      
    Aluno aluno1 = new Aluno("Felipe", 19, 10);
    
    Aluno aluno2 = new Aluno("teste", 20, 9);

    
    Vetor vetores = new Vetor();
    
    vetores.adicionarAluno(aluno1);
    vetores.adicionarAluno(aluno2);
    
    System.Console.Write(vetores.tamanhoAtual());
    
    System.Console.Write(vetores.contem(aluno1));
    
    
  }
}