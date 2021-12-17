import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca B = new Biblioteca();
        int choice=0, pos2=-1;
        do{
            B.menu();
            choice = input.nextInt();
            switch (choice){
                case 0: 
                    System.out.println("\nGrazie per aver usato questo programma!\n");
                    break;
                
                case 1: 
                    B.newLibro();
                    break;
                
                case 2: 
                    B.stampa();
                break;

                case 3: 
                    pos2=B.ricerca();
					if (pos2==-1){
						System.out.println("Il libro che cerchi non e' nell'elenco.\n");
					}
					else{
						System.out.println("Il libro che cerchi e' il numero " + (pos2+1) + " nella lista!\n");
					}
                    break;

                case 4:
                    if (B.diml>0){
						pos2=B.ricerca();
						B.cancella(pos2);
					}
					else{
						System.out.println("Attualmente la lista pare sia vuota.\n");
					}
                    break;
                case 5:
                    B.sort();
                    break;
                default:
                    B.crash();
                    break;
            }
        }while(choice!=0);
        input.close();
    }
}
