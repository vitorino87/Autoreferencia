/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoreferencia;

/**
 *
 * @author tiago.lucas
 */
public class AutoReferencia {
    
    public AutoReferencia(){
        teste();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    // TODO code application logic here
        /**
         * Autoreferência a um objeto
         * Em certas ocasiões é necessário que se faça
         * uma referência ao objeto no qual o método 
         * está sendo executado, como um todo, para isso
         * existe o this.
         */
        TestAutoreferencia ta = new TestAutoreferencia();
        ta.testarAutoreferencia();
        
        AutoReferencia ar = new AutoReferencia();
        ar.teste();
        
    }
    public final void teste(){
        System.out.println(this);
    }
}
