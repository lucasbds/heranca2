package Questao3;
public class Pessoa {
    
   private String Nome;
   private String Endereco;
   private String Telefone;

    public Pessoa(String n, String e, String t) {
        this.Nome = n;
        this.Endereco = e;
        this.Telefone = t;
    }
   
   

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String n) {
        this.Nome = n;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEdereco(String e) {
        this.Endereco = e;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String t) {
        this.Telefone = t;
    }
}