package Questao3;

public class Testa {
    
    public static void main(String args []){
    
        Pessoa p1 = new Pessoa("lucas", "rua", "456");
        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
        
        Fornecedor f1 = new Fornecedor("lucas", "av", "123", 600, 700);
        System.out.println(f1.ObterSaldo());
        
        Empregado e1 = new Empregado("lucas", "av", "123", "013", 456, 10);
        System.out.println(e1.CalcularSalario());
        
        Administrador a1 = new Administrador("lucas", "av", "123",  "013", 654, 10, 500);
        System.out.println(a1.CalcularSalario());
        
        Operario o1 = new Operario("lucas", "av", "123",  "013", 954, 25, 900, 5);
        System.out.println(o1.CalcularSalario());
        
    }
}