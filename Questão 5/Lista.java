public class Lista{
    private Noh inicio;
    private Noh fim;

    public Lista(){
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

    public int nroPares(){
        int cont = 0;
        Noh p = null;

        p = inicio;

        while(p != null){

        if(p.getInfo() % 2 == 0){
            cont++;
        }

        p = p.getProx();
    }
    return cont;
}
}