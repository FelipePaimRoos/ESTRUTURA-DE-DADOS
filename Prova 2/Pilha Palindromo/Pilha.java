public class Pilha implements IPilha{

    private Object[] pilha;
    private int numElem;

    public Pilha(int tamVetor){
        this.pilha = new Object[tamVetor];
        this.numElem = 0;
    }

    @Override
    public boolean Push(Object info) {
        if(this.numElem == pilha.length){
            System.out.println("Limite ultrapassado.");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    @Override
    public Object Pop() {
        Object o = null;
        if(this.isEmpty()){
            System.out.println("Pilha vazia.");
            return null;
        }
        o = this.pilha[numElem -1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    @Override
    public Object Top() {
        return this.pilha[0];
    }

    @Override
    public boolean isEmpty() {
        if(numElem == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return numElem;
    }

    public void imprimir(){
        for(int i = 0; i < numElem; i++){
            System.out.println(pilha[i]);
        }
    }

    public boolean palindromo(String palavra){
        String p = "";
        
        for(int i = palavra.length() -1; i >= 0; i--){
            Push(palavra.charAt(i));
        }

        imprimir();

        for(int j = -1; j <= numElem; j++){
            p += Pop(); 
        }

        imprimir();

        if(p.equals(palavra)){
            System.out.println("A palavra é palimdroma");
            return true;
        } else {
            System.out.println("A palavra não é palimdroma");
            return false;
        }
    }
    
}
