
using System;
public class LSE : Lista{
    private Noh inicio;


    public LSE(){
        Noh inicio = null;
    }

    public bool estahVazia()
    {
        throw new NotImplementedException();
    }

    public void insereFim(object item)
    {
        Noh novo = new Noh(item);

        if(inicio == null){
            inicio = novo;
        }
        else{
            Noh ultimo;
            for(Noh i = inicio; i != null; i = i.Proximo){
                ultimo = i;
                ultimo.Proximo = novo;
            }
        }
    }

    public void insereInicio(object item)
    {
        Noh novo = new Noh(item);

        if(inicio == null){
            inicio = novo;
        }
        else {
            novo.Proximo = inicio;
            inicio = novo;
        }
    }

    public bool remove(object item)
    {
        
        Noh p;
        Noh ant = null;

        p = inicio;
        while(p != null && p.Item != item){
            ant = p;
            p = p.Proximo;
        }

        if(p == null ){  
            inicio = p.Proximo;
            return false;
        }
        
        if(ant == null){
            inicio = p.Proximo;
        }
        
        else{
            ant.Proximo = p.Proximo;
            return true;
    }
        return false;
       
    }

    public int tamanho()
    {
        throw new NotImplementedException();
    }
    
    public void relatorio(){

       Noh p = null;
       object q = null;

       p = inicio;

       while ( p != null )
       {
       q = p.getItem();
       p = p.Proximo;

       System.Console.Write('\n'+convAluno(q).getNome());
       }
    }

    public Aluno convAluno(object item){

            Aluno r = (Aluno) item;

            return r;
    }
}

