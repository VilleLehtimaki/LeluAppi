public class Vieteriauto extends Lelu{

    protected int nopeus;

    protected void kiihdyta(){
        nopeus++;
    }

    Vieteriauto(){
        int nopeus;
        String nimi;
        int paino;
    }

    Vieteriauto(int nopeus, String nimi, int paino){
        this.nopeus = nopeus;
        this.nimi = nimi;
        this.paino = paino;
    }

    @Override
    protected void tulostaTiedot(){
        System.out.println("Vieteriauton nimi on " + nimi);
        System.out.println("Vieteriauton paino on " + paino);
        System.out.println("Vieteriauton nopeus on " + nopeus);
    }
    
}
