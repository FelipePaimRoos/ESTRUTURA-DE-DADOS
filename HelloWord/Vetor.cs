class Vetor : IVetor{
    

    object[] listaGeral = new object[2];

    //Aluno[] listaAlunos = new Aluno[2]; 
    
    public int tamanho = 0;
    
    public int tamanhoAtual(){
        
        return this.listaGeral.Length;
        
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
                
            }else {
                return false;
               
            }
        }
        return false;
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

/*
    public string relatorio(){
        for(int i = 0; i < listaAlunos.Length; i++){
            
        }
    }
    */
}   
