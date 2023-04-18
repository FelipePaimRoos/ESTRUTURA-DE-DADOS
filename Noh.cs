public class Noh{


    public object item;
    private Noh noh;

    public Noh(object item)
    {
        this.item = item;
        this.noh = null;
    }

    public object Item{
        get {return item;}
    }

    public Noh Proximo{
        get{return noh;}
        set{this.noh = value;}
    }

    public object getItem(){
        return item;
    }

}