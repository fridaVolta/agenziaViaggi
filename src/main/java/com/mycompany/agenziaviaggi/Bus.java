/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;

/**
 *
 * @author frida
 */
public class Bus {
    private String targa;
    private String autista; //opzionale
    
    public Bus(String t){
        targa=t;
    }
    public String PrendiTuristiDaAlloggio(String nazionalita){
        return new String("il bus con targa "+ targa+ " va a prendere i turisti "+
                nazionalita + " presso il loro alloggio");
    }
    public String ConduciTuristiAlPorto(String nazionalita){
        return new String("il bus con targa "+ targa+ " arriva al porto "+
                "con i turisti "+ nazionalita);
    }
       public void setAutista(String a){
        autista=a;
    }
    
}
