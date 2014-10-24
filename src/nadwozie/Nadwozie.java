package nadwozie;

/**
 * Klasa reprezentuje nadwozie w pojeździe
 * @author dominisz
 */
public class Nadwozie {
    //pola
    private Drzwi[] drzwi;
    private Lusterko lusterkoLewe;
    private Lusterko lusterkoPrawe;
    private Maska maska;
    private Zderzak zderzakPrzedni;
    private Zderzak zderzakTylny;
    
    //konstruktor
    /**
     * Tworzy obiekt klasy Nadwozie. Nadwozie składa się z drzwi, lusterek, maski i zderzaków
     */
    public Nadwozie() {
        drzwi=new Drzwi[4];
        for (int i=0; i<4; i++) {
            drzwi[i]=new Drzwi();
        }//for
        lusterkoLewe=new Lusterko();
        lusterkoPrawe=new Lusterko();
        maska=new Maska();
        zderzakPrzedni=new Zderzak();
        zderzakTylny=new Zderzak();
        System.out.println("[nadwozie.Nadwozie] Utworzono obiekt klasy Nadwozie");
    }//public Nadwozie
    
}//public class Nadwozie
