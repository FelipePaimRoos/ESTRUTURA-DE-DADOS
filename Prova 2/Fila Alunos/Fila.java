public class Fila implements IFila{

    private Noh inicio;
    private Noh fim;
    private int numElem;

    public Fila(){
        this.inicio = null;
        this.fim = null;
        this.numElem = 0;
    }

    public Noh getInicio(){
        return inicio;
    }

    public Noh getFim(){
        return fim;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if(this.isEmpty()){
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        numElem++;
        return true;
    }

    @Override
    public boolean remove() {
        if(!isEmpty()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProx();
            }
            numElem--;
            return true;
            
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if(inicio == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int size() {
        return numElem;
    }

    public void imprimir(){

        Noh p = inicio;

        for(int i = 0; i < numElem; i++){ 
            System.out.println(p.getInfo());
            p = p.getProx();
        }


    }
    
}
