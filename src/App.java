public class App {
    public static void main(String[] args){
        
        Lelu lelu = new Lelu("Nalle", 1);
        Vieteriauto vieteriauto = new Vieteriauto(1, "Verrari", 2);

        System.out.println("Hello World");

        lelu.tulostaTiedot();

        vieteriauto.kiihdyta();
        vieteriauto.tulostaTiedot();

    }
}
