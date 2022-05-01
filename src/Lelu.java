public class Lelu {

    protected String nimi = "nalle";
    protected int paino = 1;

    Lelu(){
        String nimi;
        int paino;
    }

    Lelu(String nimi, int paino){
        this.nimi = nimi;
        this.paino = paino;
    }

    protected void tulostaTiedot(){
        System.out.println("Lelun nimi on " + nimi);
        System.out.println("Lelun paino on " + paino);
    }
    
}
