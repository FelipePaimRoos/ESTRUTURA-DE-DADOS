import java.util.Map;

public class Mapa {
    
    public LSE[] vetorLista;

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

    public boolean remove(int chave){
        int hash = hash(chave);

        LSE lista = this.vetorLista[hash];

        if(lista == null){
            return false;
        } else {
            for(Noh n = lista.getInicio(); n != null; n = n.getProx()){
                if(n.getInfo().getMatricula() == chave){
                    vetorLista[hash].remove(n.getInfo());
                }
            }
            return true;
        }
        
    }

    public int hash(int chave){

        return chave % vetorLista.length;

    }


    public void resize(){
        LSE[] lista = new LSE[vetorLista.length * 2];
        
        vetorLista = lista;
        }


    public void imprimir(){
        
        for(int i = 0; i < vetorLista.length; i++){
            System.out.println("Na casa "+i+" existe: ");
                if(vetorLista[i] != null){
                    vetorLista[i].imprimirLista();
                }
        }
    }

    public void rehash(){

        for(int i = 0; i < vetorLista.length; i++){
            int hash = hash(i);

            LSE lista = this.vetorLista[hash];
            
            for(Noh n = lista.getInicio(); n != null; n = n.getProx()){
                put(n.getInfo().getMatricula(), n.getInfo());
        }
            
        }
    }

    public Aluno get(int chave){
        int hash = hash(chave);

        LSE lista = this.vetorLista[hash];

        if(lista == null){
            return null;
        } else {
            for(Noh n = lista.getInicio(); n != null; n = n.getProx()){
                if(n.getInfo().getMatricula() == chave){
                    return n.getInfo();
                }
            }
            return null;
        }
    }
    
}
