public class Aluno{

    int idade;
    string nome;

    public Aluno (string nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public int IDADE{
        get{ return idade;}
        set{this.idade = value;}
    }

    public string NOME{
        get{return nome;}
        set{this.nome = value;}
    }   

    public string getNome(){
        return nome;
    }


}