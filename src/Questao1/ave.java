package Questao1;

public class ave extends animal{
    
    private boolean Voa;
    
    public ave(String n, boolean v){
    
        super(n);
        this.setVoa(v);
    }
    public boolean getVoa(){
    
        return this.Voa;
    }
    public void setVoa(boolean v){
  
        this.Voa = v;
    }
    public void talk(){
    
        System.out.println("Piu-Piu");
    }
}