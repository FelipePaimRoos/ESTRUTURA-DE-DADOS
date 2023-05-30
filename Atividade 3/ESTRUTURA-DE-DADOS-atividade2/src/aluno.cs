
public class Aluno{
    
    public string nome;
    public int idade;
    public float nota;
    
    public Aluno(string _nome, int _idade, float _nota){
        nome = _nome;
        idade = _idade;
        nota = _nota;
    }
    
    public string Nome {
        get {
            return nome;
        }
        set => nome = value;
        
    }
    
    public int Idade {
        get {
            return idade;
        }
        set => idade = value;
    }
    
    public float Nota{
        get {
            return nota;
        }
        set => nota = value;
    }
    
}