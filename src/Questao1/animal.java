package Questao1;

public class animal {
    
    private String Nome;
    
    public animal(String n){
    
        this.setNome(n);
    }
    public String getNome(){
    
        return this.Nome;
    }
    public void setNome(String n){
    
        this.Nome = n;
    }
     public void imprime(){
     
         System.out.println(this.getNome());
     }
     public void talk(){
     
     }
}