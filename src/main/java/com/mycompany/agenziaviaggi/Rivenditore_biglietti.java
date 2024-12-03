/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;

/**
 *
 * @author frida
 */
public class Rivenditore_biglietti {
    private String nome;
    
    public Rivenditore_biglietti(String n){
        nome=n;
    }
    
    public String VendiBigliettiATuristi(String nazionalita){
        return new String("effettuato a "+ nome+
                " il pagamento dei biglietti da parte dei turisti "+
                nazionalita);
    }
}
