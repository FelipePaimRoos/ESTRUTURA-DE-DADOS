public class LSE {
    
    private Noh inicio;

    public LSE(){
        this.inicio = null;
    }

    public Noh getInicio(){
        return inicio;
    }

    public void insereInicio(Aluno info){
        Noh novo = new Noh(info);

        if(inicio == null){
            inicio = novo;
        } else {
            novo.setProx(inicio);
            inicio = novo;
        }

    }

    public boolean remove(Aluno info){
        Noh p;
        Noh ant = null;

        p = inicio;
        while(p != null && p.getInfo() != info){
            ant = p;
            p = p.getProx();
        }

        if(p == null ){  
            inicio = p.getProx();
            return false;
        }
        
        if(ant == null){
            inicio = p.getProx();
        }
        
        else{
            ant.setProx(p.getProx());
            return true;
    }
        return false;
       
    }

    public void imprimirLista(){

        Noh p = inicio;
        while(p != null){
            System.out.println(p);
            p = p.getProx();
        }
    }
}
