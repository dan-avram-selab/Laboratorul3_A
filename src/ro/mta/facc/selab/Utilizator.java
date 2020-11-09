package ro.mta.facc.selab;

import java.util.ArrayList;

public class Utilizator {
    String nume;
    ArrayList<Carte> cartiImprumutate;

    public Utilizator(String nume) {
        this.nume = nume;
    }

    public String getName()
    {
    	return nume;
    }
	
	public void setNume(String numeNou)
	{
		this.nume = numeNou;
	}

	public ArrayList<Carte> getCartiImprumutate()
	{
		return cartiImprumutate;
	}
}
