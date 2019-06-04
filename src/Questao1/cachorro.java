package Questao1;

public class cachorro extends mamifero{
    
    private boolean Latealto;
    
    public cachorro(String n, int p, boolean LT){
    
        super(n, p);
        this.setLatealto(LT);
    }

    public boolean getLatealto() {
        return this.Latealto;
    }

    public void setLatealto(boolean LT) {
        this.Latealto = LT;
    }
    public void talk(){
    
        System.out.println("Au, Au");
    }
}