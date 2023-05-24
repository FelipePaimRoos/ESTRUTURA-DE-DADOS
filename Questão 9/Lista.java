public class Lista {
    private Noh inicio;
    int totalElementos = 10;
    

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


    public void bubble_sort(){

        while (inicio == null){

            for(int i = 0; i < totalElementos; i++){
                for(int j = 0; j < totalElementos-1; j++){
                    if(inicio.getInfo() > inicio.getProx().getInfo()){
                        Noh aux = inicio;
                        inicio = inicio.getProx(); 
                        inicio.setProx(aux);
                    }
                }
            }
        }
    }

    

}
