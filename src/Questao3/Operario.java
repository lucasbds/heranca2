package Questao3;

public class Operario extends Empregado{
    
    private double ValorProducao;
    private double comissao;
    
    public Operario(String n, String e, String t, String cs, double sb, double i, double vp, double com){
    
        super(n, e, t, cs, sb, i);
        this.setValorProducao(vp);
        this.setComissao(com);
        
    }

    public double getValorProducao() {
        return this.ValorProducao;
    }

    public void setValorProducao(double vp) {
        this.ValorProducao = vp;
    }

    public double getComissao() {
     
        return this.comissao;
    }

    public void setComissao(double com) {
        this.comissao = com / 100;
    }
    public double calcularSalario(){
   
        double salario;
        double a, b, c;
        salario = this.getSalarioBase() * this.getImpostos();
        a = this.getSalarioBase() - salario;
        c = this.getComissao() * this.getValorProducao();
        b = a + c;
        return b;
    }
}