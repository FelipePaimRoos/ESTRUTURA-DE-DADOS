public class FilaLista implements IFila{
    
    private Noh inicio;
    private Noh fim;

    public FilaLista(){
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Object info){
        Noh novo = new Noh(info);

        if(this.isEmpty()){
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        return true;

    }

    @Override
    public boolean remove() {
        if(!isEmpty()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            }else {
                inicio = inicio.getProx();
            }
            return true;
        }
        return false;
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
        int cont = 0;
        if(inicio == null){
            return 0;
        }else {
            Noh p = inicio;
            while (p != null){
                p = p.getProx();
                cont++;
            }
            return cont;
        }
    }

    public void imprimirFila(){
    
        if(inicio == null){
            System.out.println("Fim da linha");
        } else {
            Noh p = inicio;
            while (p != null){
            System.out.println(p.getInfo());
            p = p.getProx();
        }
        System.out.println("Fim da linha");
    }
    }


}
