public class Libro{ //Libri antichi, libri moderni e manoscritti
    protected String Titolo;
    protected String Autore; //Di che animale si tratta

	public Libro(String T, String A){
        Titolo = new String(T);
        Autore = new String(A);
	}

    public Libro(){
        Titolo = "";
        Autore = "";
    }
    
    //@Override
    public String stato(){
        return "Titolo: " + Titolo + " \nAutore: " + Autore + "\n";
    }
	
}