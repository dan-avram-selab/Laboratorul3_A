package ro.mta.facc.selab;

/**
 * Modeleaza un obiect de tip carte pentru a putea fi folosit intr-o alta clasa(Ex. {@link Biblioteca})
 * <p><b>Important:</b> Pentru stocare se va folosi un obiect de tip Container</p>
 *
 * <pre>Carte c = new Carte("Zece negri mititei", "Agatha Cristie", 1998, 719);</pre>
 *
 * @author dan.avram
 * @see Biblioteca
 * @see Utilizator
 */
public class Carte implements Comparable<Carte> {
    /**
     * Titlul cartii. Poate contine cifre, litere si spatii
     */
    private String titlu;
    /**
     * etc..
     */
    private String autor;
    private int anAparitie;
    private int nrPagini;

    public String getAutor()
    {
    	return autor;
    }

    /**
     * Metoda folosita pentru compararea cu un obiect de tip Carte
     *
     * @param o Obiectul cu care se compara
     * @return Intoarce -1 daca obiectul este mai mic decat <i>o</i>, 1 daca..
     */
    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;
        return 0;
    }

    public Carte(String titlu, String autor, int anAparitie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor + " a fost publicata in anul " + this.anAparitie;
    }
}
