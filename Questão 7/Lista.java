public class Lista {
    private Noh inicio;
    

    public Lista(){
        this.inicio = null;
        
    }

    public void insereInicio(int info){
        Noh novo = new Noh(info);

        if(inicio == null){
            inicio = novo;

        } else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void imprime_rec(){
    
        if(inicio == null){
            System.out.println("Fim da linha");
        } else {
            System.out.println(inicio.getInfo());
            inicio = inicio.getProx();
            imprime_rec();
        }
    }


}
