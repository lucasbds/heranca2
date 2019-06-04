package Questao1;

public class vaca extends mamifero{
    
    private boolean TemLeite;
    
    public vaca(String n, int p, boolean TL){
    
        super(n, p);
        this.setTemLeite(TL);
    }

    public boolean getTemLeite() {
        return this.TemLeite;
    }

    public void setTemLeite(boolean TL) {
        this.TemLeite = TL;
    }
    public void talk(){
    
        System.out.println("Muuu");
    }
}