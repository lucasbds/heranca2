package Questao1;

public class TestaAni {
    
    public static void main(String args []){
    
        papagaio p1 = new papagaio("PAPAGAIO", true, "Save the animals");
        System.out.println(p1);
        p1.talk();
        
        
        
        arara a1 = new arara("ARARA", true);
        a1.talk();
        
        cachorro c1 = new cachorro("dog", 4, true); 
        c1.talk();
        
        vaca v1 = new vaca("munhoca", 4, true);
        v1.talk();
    }
}