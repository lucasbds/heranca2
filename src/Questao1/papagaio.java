package Questao1;

public class papagaio extends ave{
    
    private String Frase;
    
    public papagaio(String n, boolean v, String F){
    
        super(n, v);
        this.setFrase(F);
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String F) {
        this.Frase = F;
    }
    public void talk(){
    
        System.out.println(this.Frase);
    } 
}