class Vetor{
    
    Aluno[] listaAlunos = new Aluno[10]; 
    
    public int tamanho = 0;
    

    public void adicionarAluno(Aluno aluno){
        
        for(int i = 0; i < listaAlunos.Length; i++){
            if(listaAlunos[i] == null){
                listaAlunos[i] = aluno;
                tamanho = tamanho +1;
                break;
            }
        }
    }
    
    public int tamanhoAtual(){
        
        return this.tamanho;
        
    }
    
    public bool contem(Aluno aluno){
        for(int i = 0; i < listaAlunos.Length; i++){
            if(listaAlunos[i] == aluno){
                return true;
                break;
            }else {
                return false;
                break;
            }
        }
        return false;
    }
    
    
}