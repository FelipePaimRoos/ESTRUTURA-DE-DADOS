public class Pilha implements IPilha{

    private Object[] pilha;
    private int numElem;
    

    public Pilha(int numElem){
        this.pilha = new Object[numElem];
        this.numElem = 0;
    }

    @Override
    public boolean Push(Object info) {
        if(this.numElem == pilha.length){
            System.out.println("Pilha sem espaço");
            return false;
        }else {
            this.pilha[numElem] = info;
            this.numElem++;
            return true;
        }
    }

    @Override
    public Object Pop() {
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }else {
            o = this.pilha[numElem - 1];
            this.pilha[numElem - 1] = null;
            this.numElem--;
            return o;
        }
    }

    @Override
    public Object top(){
        return pilha[numElem -1];
    }

    @Override
    public boolean isEmpty(){
        if(numElem == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int size() {
        return numElem;
    }
    
    public void inverteFila(Fila fila){
        int num = fila.size();

        Pilha pilha = new Pilha(fila.size());

        Noh p = fila.getInicio();
        
        Object q = p.getInfo();

        for(int i = 0; i < fila.size() ; i++){
            q = p.getInfo(); 
            pilha.Push(q);
            p = p.getProx();
            
        }
        
        for(int i = 0; i < pilha.size() ; i++){
            fila.remove();
        }

        for(int i = 0; i < num ; i++){
            fila.add(pilha.Pop());
        }
        
    }

    
}
