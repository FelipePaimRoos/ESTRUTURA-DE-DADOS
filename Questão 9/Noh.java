public class Noh {

    public int info;
    public Noh prox;
    
    public Noh(int info){
        this.info = info;
        this.prox = null;
    }

    public int getInfo(){
        return info;
    }

    public void setInt(int info){
        this.info = info;
    }

    public Noh getProx(){
        return prox;
    }

    public void setProx(Noh prox){
        this.prox = prox;
    }

}
