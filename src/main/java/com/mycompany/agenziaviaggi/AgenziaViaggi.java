/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.agenziaviaggi;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frida
 */
public class AgenziaViaggi {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<GestoreTrasporti> gestoreTrasportiList = new ArrayList<GestoreTrasporti>();
        Bus b1 = new Bus("EE745TO");
        Bus b2 = new Bus("ZZ445TR");
        Bus b3 = new Bus("GV345TH");
        Rivenditore_biglietti rv1 = new Rivenditore_biglietti("Mirka");
        Rivenditore_biglietti rv2 = new Rivenditore_biglietti("James");
        Rivenditore_biglietti rv3 = new Rivenditore_biglietti("Liliana");
        Traghetto t= new Traghetto("GT675HJK");
        StringBuilder s= new StringBuilder();
        gestoreTrasportiList.add(new GestoreTrasporti("francesi", b1, rv1, t, s));
        gestoreTrasportiList.add(new GestoreTrasporti("tedeschi", b2, rv2, t, s));
        gestoreTrasportiList.add(new GestoreTrasporti("spagnoli", b3, rv3, t, s));
        
        ArrayList<Thread> gestoreTrasportiThreadList = new ArrayList<Thread>();
        for (GestoreTrasporti gt : gestoreTrasportiList) {
            Thread n = new Thread(gt);
            gestoreTrasportiThreadList.add(n);
            n.start();
        }
        for(Thread thGestore: gestoreTrasportiThreadList){
            try {
                thGestore.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(AgenziaViaggi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        PrintWriter fileOutput = new PrintWriter("Rendicontazione.txt");
        fileOutput.append(s.toString());
        fileOutput.close();
    }
}
