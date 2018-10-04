class Main {
    public static void main (String[] args) {
    
    Vivente vivente;
    vivente=new Vivente();
    vivente.nome="Severa";
    vivente.idade=0;
    while (vivente.idade != 99) {
        vivente.fazaniversario();
        }
        // E então, quando os 99 anos chegam...
        vivente.morre();
    }
    }