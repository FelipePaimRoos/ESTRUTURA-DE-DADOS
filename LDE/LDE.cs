public class LDE : Lista{

    private Noh inicio;
    private Noh fim;

    public LDE (){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info){
        Noh novo = new Noh(info);
        
        if(inicio == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info){
        Noh novo = new Noh(info);

        if(fim == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
        
    }
    public bool estahVazia(){
        return false;
    }

    public bool remove(int info){

        Noh p;
        p = buscar(info);
        p = p.getProx();

        if(p == null){
            return false;
        } 
        if(p == inicio){
            inicio = p.getProx();
            if(inicio != null){
                inicio.setAnt(null);
            } else {
                fim = null;
            }
    } else if (p.getProx() == null){
        p.getAnt().setProx(null);
        fim = p.getAnt();
    } else {
        p.getAnt().setProx(p.getProx());
        p.getProx().setAnt(p.getAnt());
    }
    return true;
    }

    public int tamanho(){
        return 0;
    }

    public Noh buscar(int info){
        Noh p = inicio;

        while (p != null && p.getInfo() != info){
            p = p.getProx();
        }
        return p;
    }

    public void imprimirInicioFim(){
        Noh p = null;

       p = inicio;

       while ( p != null ){
       System.Console.Write("\n"+p.getInfo());
       p = p.getProx();
       }
    }

    public void imprimirFimInicio(){
        Noh p = null;

       p = inicio;

       while ( p != null ){
       System.Console.Write("\n"+p.getInfo());
       p = p.getAnt();
       }
    }
    }
