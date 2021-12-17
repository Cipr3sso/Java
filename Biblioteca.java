import java.util.Scanner;


public class Biblioteca extends Libro{

    Scanner input =new Scanner(System.in);
	Scanner inputTitolo =new Scanner(System.in);
	Scanner inputAutore =new Scanner(System.in);
	Scanner inputAnno =new Scanner(System.in);
	Scanner inputFont =new Scanner(System.in);
    Scanner inputRotoli =new Scanner(System.in);
	Scanner sceltaLibro = new Scanner(System.in);
    Libro[] lista;
    int diml=0;
    int choicee=9; 
        String temp1;
        String temp2;
		String temp3;
        int temp4;

    public Biblioteca(){
        lista=new Libro[10];
        diml=0;
    }

    public void menu(){
        System.out.println("Scegli un'opzione: ");
        System.out.println("1. Nuovo libro da tastiera");
        System.out.println("2. Stampa i libri presenti nella lista");
        System.out.println("3. Cerca un libro (da tastiera)");
        System.out.println("4. Elimina un libro dalla lista");
        System.out.println("5. Ordine alfabetico dato il titolo");
		System.out.println("0. Esci dal programma");
    }

    public void newLibro(){
        
        if(diml<10){
            System.out.println("Che animale vuoi inserire?");
			System.out.println("1. Un Libro Antico");
			System.out.println("2. Un Libro Moderno");
            System.out.println("3. Un Manoscritto");
            System.out.println("Oppure qualsiasi altro numero per un normale libro");

			System.out.println("Quale tipo di libro vorresti aggiungere?");
			choicee=sceltaLibro.nextInt();
			switch (choicee){
				case 1:{
					
					System.out.println("Inserisci l'anno di pubblicazione: ");
					temp4= inputAnno.nextInt();
					lista[diml]=new LibriAntichi(temp1, temp2, temp4);
					diml++;
					System.out.println("\nLibro aggiunto all'elenco con successo.\n");
				}break;
				case 2:{
                    System.out.println("Inserisci il titolo del libro: ");
                    temp1 = inputTitolo.nextLine();
                    System.out.println("Inserisci il l'autore: ");
                    temp2 = inputAutore.nextLine();
					System.out.println("Inserisci il nome del font utilizzato nel libro: ");
					temp3= inputFont.nextLine();
					lista[diml]=new LibriModerni(temp1, temp2, temp3);
					diml++;
					System.out.println("\nLibro aggiunto all'elenco con successo.\n");
				}break;
                case 3:{
                    System.out.println("Inserisci il titolo del libro: ");
                    temp1 = inputTitolo.nextLine();
                    System.out.println("Inserisci il l'autore: ");
                    temp2 = inputAutore.nextLine();
                    System.out.println("Inserisci il numero dei rotoli con cui e' stato scritto il manoscritto: ");
                    temp4 = inputRotoli.nextInt();
                    lista[diml]=new ManoScritti(temp1, temp2, temp4);
                    diml++;
                    System.out.println("\nLibro aggiunto all'elenco con successo.\n");
                    break;
                }
				default:{
                    System.out.println("Inserisci il titolo del libro: ");
                    temp1 = inputTitolo.nextLine();
                    System.out.println("Inserisci il l'autore: ");
                    temp2 = inputAutore.nextLine();
					lista[diml]=new Libro(temp1, temp2);
					diml++;
					System.out.println("\nLibro aggiunto all'elenco con successo.\n");
				}break;
			}
        }else{
            System.out.println("Array al completo\n");
        }
    }

    public void stampa(){
        if(diml==0){
            System.out.println("\nPare che la biblioteca sia vuota 🤔\n");
        }else{
            for(int i=0;i<diml;i++){
                System.out.println("Libro n."+(i+1)+"\n"+lista[i].toString()+"\n");
            }
        }
    }
        
    public int ricerca(){
        String tempString;
        int pos = -1;
        System.out.println("Ecco a te la lista dei libri presenti in biblioteca: \n");
        stampa();
        System.out.println("Inserisci il nome del libro che intendi cercare o eliminare : \n");
        tempString = input.nextLine();
        for(int i=0;(i<diml)&&(pos==-1);i++){
            if(tempString.compareTo(lista[i].Titolo)==0){
                pos=i;
            }
        }
        return pos;
    }

    public void cancella(int pos){
        for(int i=pos;i<(diml-1);i++){
            lista[i] = lista[i+1];
        }
        diml--;
    }

    public void sort() {
        int i;
        int j;
        Libro temp;
 
        for(i=0;i<(diml-1);i++){
            for(j=i+1;j<diml;j++){
                if(lista[i].Titolo.compareTo(lista[j].Titolo)>0){
                    temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
 
                }
            }
        }
 
     }

    public void crash(){
        System.out.println("\nNumero non valido. Riprova.\n");
    }
}