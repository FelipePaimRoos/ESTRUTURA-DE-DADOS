public class Main{

    public static void main(String[] args){

        Lista lista = new Lista();

        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereInicio(4);

        System.out.println(lista.nroPares());
    }
}