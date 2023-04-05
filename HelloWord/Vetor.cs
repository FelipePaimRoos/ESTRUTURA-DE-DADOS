class Vetor : IVetor{


    object[] listaGeral = new object[2];

    //Aluno[] listaAlunos = new Aluno[2];

    public int tamanho = 0;

    public int tamanhoAtual(){
        int cont = 0;
        for (int i = 0; i < listaGeral.Length; i++){
            if(listaGeral[i] != null){
                cont++;
            }
        }
        return cont;
    }

    public void adicionarAluno(Aluno aluno){

        for(int i = 0; i < listaGeral.Length; i++){

            if(cheio() == false){

            listaGeral[tamanho] = aluno;
            tamanho = tamanho+1;
            break;
            } else {
                novoVetor();

            }
        }
        }

    public bool contem(Aluno aluno){
        for(int i = 0; i < listaGeral.Length; i++){
            if(listaGeral[i] == aluno){
                return true;
            
        }
    }return false;
    }

    public bool cheio(){
        if(tamanho == listaGeral.Length){
            return true;
        }
        return false;
    }

    public void novoVetor(){

        if(cheio() == true){
            object[] listaGerali = new object[tamanho*2];

                for(int i = 0; i < listaGeral.Length; i++){
                    listaGerali[i] = listaGeral[i];
                }

            listaGeral = listaGerali;
        }
    }

    public bool remove(Aluno aluno){
        for(int i = 0; i < listaGeral.Length; i++){
            if(listaGeral[i] == aluno){
                listaGeral[i] = listaGeral[i+1];
                for(int j = i; j < (listaGeral.Length-i-1); j++){
                    listaGeral[j] = listaGeral[j+1];
                }
                return true;
    }
}   return false;
}
}
