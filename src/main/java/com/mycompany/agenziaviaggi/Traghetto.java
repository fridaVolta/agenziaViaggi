/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;
/**
 *
 * @author frida
 */
public class Traghetto {
    private String targa;
    private String nazionalitaPasseggeri;
    private boolean IsOccupato=false; //semaforo
    public Traghetto(String t){
        targa=t;
    }
    
    public synchronized String Imbarco(String nazionalita) throws InterruptedException{
        String output=new String();
        while(IsOccupato){
            wait();
        }
        IsOccupato=true;
        output="i turisti "+nazionalita+" stanno effettuando l'imbarco sul traghetto";
        System.out.println(output);
        output="i turisti "+nazionalita+" stanno partendo dal porto con il traghetto";
        System.out.println(output);
        return output;
    }
    public synchronized String RitornoAlPorto(String nazionalita){
        String output=new String();
        output="il traghetto torna al porto dopo aver portato i turisti "+nazionalita;
        System.out.println(output);
        notifyAll();
        IsOccupato=false;
        return output;
        
    }
}
