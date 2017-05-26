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
public class TestAutoreferencia {
    /**
         * Autoreferência a um objeto
         * Em certas ocasiões é necessário que se faça
         * uma referência ao objeto no qual o método 
         * está sendo executado, como um todo, para isso
         * existe o this.
         */
    public void testarAutoreferencia(){
        System.out.println(this);
        AutoReferencia ar = new AutoReferencia();
        ar.teste();
    }
}
