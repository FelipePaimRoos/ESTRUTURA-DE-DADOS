public class Aluno{
    
    public String nome;
    public int idade;
    public float nota;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.nota = 0;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getNota(){
        return nota;
    }

    public void setNota(float nota){
        this.nota = nota;
    }


}
