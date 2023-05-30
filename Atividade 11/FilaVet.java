public class FilaVet implements IFila{

    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila){
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) {
        if(this.nElemFila == vetFila.length){
            System.out.println("Capacidade da Fila esgotada");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
}    

    @Override
    public boolean remove() {
        if(this.isEmpty()){
            System.out.println("Fila está vazia");
            return false;
        }
        this.inicio = (this.inicio +1 ) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if(nElemFila == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return nElemFila;
    }
    

    public void imprimirFila(){
        if(this.isEmpty()){
            System.out.println("Fila está vazia");
        }
        for(int i = 0; i < nElemFila; i++){
            System.out.println(vetFila[i]);
        }

    }
}
