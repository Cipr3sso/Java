public class ManoScritti extends Libro{

        protected int NumRotoli;
    
        public ManoScritti(String T, String A, int NR){
            super(T,A);
            NumRotoli = NR;
        }
    
        public ManoScritti(){
            super();
            NumRotoli = 0;
    
        }
        
        public String toString(){
            return "Titolo: " + Titolo + " \nAutore: " + Autore + " \nRotoli: " + NumRotoli + "\n";
        }
}
