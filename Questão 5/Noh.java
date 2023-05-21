public class Noh {

    public int info;
    public Noh ant;
    public Noh prox;
    
    public Noh(int info){
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public int getInfo(){
        return info;
    }

    public void setInt(int info){
        this.info = info;
    }

    public Noh getAnt(){
        return ant;
    }

    public void setAnt(Noh ant){
        this.ant = ant;
    }

    public Noh getProx(){
        return prox;
    }

    public void setProx(Noh prox){
        this.prox = prox;
    }

}
