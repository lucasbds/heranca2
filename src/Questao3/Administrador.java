package Questao3;

public class Administrador extends Empregado {
    
    private double ajudaDeCusto;
    
    public Administrador(String n, String e, String t, String cs, double sb, double i, double aj){
    
        super(n, e, t, cs, sb, i);
        this.setAjudaDeCusto(aj);
    }

    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double aj) {
        this.ajudaDeCusto = aj;
    }
    public double CalcularSalario(){
   
        double salario;
        double a, b;
        salario = this.getSalarioBase() * this.getImpostos();
        a = this.getSalarioBase() - salario;
        b = a + this.getAjudaDeCusto();
        return b;
    }
}