class Vivente {

    String nome;
    int idade;
    
    void fazaniversario() {
        this.idade=this.idade+1;
        System.out.println("Parab�ns, " + this.nome + ", voc� acaba de completar " + this.idade + " anos!");
        }
    
    void morre() {
        System.out.println("Voc� morre.");
        }
    }