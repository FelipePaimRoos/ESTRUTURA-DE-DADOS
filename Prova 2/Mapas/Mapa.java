public class Mapa {
    
    private LSE[] vetorLista;

    public Mapa() {
        this.vetorLista = new LSE[10];
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);

        LSE alunos_lista = this.vetorLista[hash];
        if (alunos_lista == null) {
            alunos_lista = new LSE();
            alunos_lista.insereInicio(valor);
            this.vetorLista[hash] = alunos_lista;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProx()) {
                if (n.getInfo().getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);

        
        }
    }

    public int hash(int chave){
        return chave % vetorLista.length;
    }


    public void resize(){
        this.vetorLista = new LSE[vetorLista.length * 2];

        for(int i = 0; i < vetorLista.length; i++){
            
        }

    }
}
