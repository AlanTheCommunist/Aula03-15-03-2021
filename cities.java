package poo2;

public class cities
{
    public String name, pop, uf;

    //Metodo construtor para ser usado no codigo.
    public cities(String name,String uf,String pop)
    {
        this.uf = uf;
        this.pop = pop;
        this.name = name;
    }


    public void Print(int i)
    {
        System.out.println(String.format(" %s | %s | %s", this.uf, this.name, this.pop));
    }
}