public class LibriAntichi extends Libro {
    protected int Anno; //Anno di uscita
    
        public LibriAntichi(String T, String A, int AN){
            super(T,A);
            Anno=AN;
        }
    
        public LibriAntichi(){
            super();
            Anno = 0;
    
        }
        @Override
        public String toString(){
            return "Titolo: " + Titolo + " \nAutore: " + Autore + " \nAnno di Uscita: " + Anno + "\n";
        }
}
