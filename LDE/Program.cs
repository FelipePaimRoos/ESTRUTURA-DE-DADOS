using System;
class HelloWorld {
  static void Main() {

    Lista lista1 = new LDE();

    lista1.insereInicio(5);
    lista1.insereFim(7);

    lista1.imprimirFimInicio();

    lista1.imprimirInicioFim();

  }
}