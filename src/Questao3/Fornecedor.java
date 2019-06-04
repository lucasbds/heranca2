package Questao3;

public class Fornecedor extends Pessoa{
    
    private double ValorCredito;
    private double ValorDivida;
    
    public Fornecedor(String n, String e, String t, double vc, double vd){
    
        super(n, e, t);
        
        this.setValorCredito(vc);
        this.setValorDivida(vd);
    }
   
    public double getValorCredito(){
    
        return this.ValorCredito;
    }
    public double getValorDivida(){
    
        return this.ValorDivida;
    }
    public void setValorCredito(double vc){
    
        this.ValorCredito = vc;
    }
    public void setValorDivida(double vd){
    
        this.ValorDivida = vd;
    }
    
    public double ObterSaldo(){
    
        double saldo;
        saldo = this.ValorCredito - this.ValorDivida;
        return saldo;
    }
}