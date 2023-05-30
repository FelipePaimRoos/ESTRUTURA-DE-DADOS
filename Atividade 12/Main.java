public class Main{

    public static void main(String[] args) {
        
        FilaLista fila = new FilaLista();

        fila.add(1);    
        fila.add(10);
        fila.add(20);

        fila.imprimirFila();
        System.out.println(fila.size());
    }
}