class Vivente {

    String nome;
    int idade;
    
    void fazaniversario() {
        this.idade=this.idade+1;
        System.out.println("Parabéns, " + this.nome + ", você acaba de completar " + this.idade + " anos!");
        }
    
    void morre() {
        System.out.println("Você morre.");
        }
    }