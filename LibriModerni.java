public class LibriModerni extends Libro{
    protected String Font;
    
        public LibriModerni(String T, String A, String F){
            super(T,A);
            Font = new String(F);
        }
    
        public LibriModerni(){
            super();
            Font = "";
    
        }
        
        public String toString()
        {
            return "Titolo: " + Titolo + " \nAutore: " + Autore + " \nFont: " + Font + "\n";
        }
}
