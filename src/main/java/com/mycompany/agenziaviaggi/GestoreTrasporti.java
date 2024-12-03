/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frida
 */
public class GestoreTrasporti implements Runnable{

    private String nazionalita;
    private Traghetto traghetto;// risorsa condivisa
    private Bus b;
    private Rivenditore_biglietti rv;
    private StringBuilder strB;
    public GestoreTrasporti(String nazionalita, Bus bus, Rivenditore_biglietti rb, Traghetto t, StringBuilder s){
        this. nazionalita=nazionalita;
        this.rv=rb;
        this.b=bus;
        this.traghetto= t;
        strB=s;
    }
    
    @Override
    public void run() {
        try {
            String output=new String();
            System.out.println(b.PrendiTuristiDaAlloggio(nazionalita));
            System.out.println(b.ConduciTuristiAlPorto(nazionalita));
            System.out.println(rv.VendiBigliettiATuristi(nazionalita));
            strB.append(traghetto.Imbarco(nazionalita));strB.append(System.getProperty("line.separator"));
            Thread.sleep(500);
            strB.append(traghetto.RitornoAlPorto(nazionalita));strB.append(System.getProperty("line.separator"));
            //output=b.PrendiTuristiDaAlloggio();
            //System.out.println(output);
        } catch (InterruptedException ex) {
            Logger.getLogger(GestoreTrasporti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
