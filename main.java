package poo2;

import java.util.ArrayList;

class main
{
    static ArrayList<cities> citiesList = new ArrayList<cities>(); 

    public static void main(String[] args)
    {
        Cities();
        Print();
    }

    public static void Cities() //Cria cidades predefinidas.
    {
        citiesList.add(new cities("Sao Paulo","SP","12.2 mln"));
        citiesList.add(new cities("Rio de Janeiro","RJ","6.7 mln"));
        citiesList.add(new cities("Brasilia","DF","3 mln"));
        citiesList.add(new cities("Salvador","BA","2.8 mln"));
        citiesList.add(new cities("Belo Horizonte","MG","2.5 mln"));
    }

    public static void Print() //Mostra a lista de cidades.
    {
        System.out.println("\n UF | City | Population");
        for(cities c : citiesList)
        {
            c.Print(citiesList.indexOf(c));
        }
        System.out.println("\n.");
    }
}