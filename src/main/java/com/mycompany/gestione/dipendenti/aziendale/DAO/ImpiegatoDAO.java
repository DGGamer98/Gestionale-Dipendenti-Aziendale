/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione.dipendenti.aziendale.DAO;

import com.mycompany.gestione.dipendenti.aziendale.MODEL.Impiegato;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class ImpiegatoDAO {

    List<Impiegato> listaImpiegato = new ArrayList<>();

    public Impiegato searchCodiceFiscale(String code) {
        for (Impiegato impiegato : listaImpiegato) {
            if (impiegato.getCodiceFiscale().equals(code)) {
                return impiegato;
            }
        }
        return null;
    }
    
    public void stampaLista() {
        for (Impiegato impiegato : listaImpiegato) {
            System.out.println(impiegato);
        }
    }
    
    public void addImpiegato(Impiegato i) {
        listaImpiegato.add(i);
        System.out.println("impiegato" + i + "aggiunto");
    }
    
    
    public boolean update(Impiegato i, Impiegato newImpiegato) {
        for (int j = 0; j < listaImpiegato.size(); j++) {
            Impiegato corrente = listaImpiegato.get(j);
            
            if(corrente.getCodiceFiscale().equals(i.getCodiceFiscale())) {
                listaImpiegato.set(j, newImpiegato);//Sostituiamo il vecchio oggetto con quello nuovo
                return true;
            }
        }
        return false;
    }
    
    public boolean elimina(String codiceFiscale) {
        for (Impiegato impiegato : listaImpiegato) {
            if(codiceFiscale.equals(impiegato.getCodiceFiscale())) {
                listaImpiegato.remove(impiegato);
                return true;
            }
        }
        return false;
    }
}


