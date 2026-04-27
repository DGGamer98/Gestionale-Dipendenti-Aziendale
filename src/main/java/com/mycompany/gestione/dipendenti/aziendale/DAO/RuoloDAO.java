/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione.dipendenti.aziendale.DAO;

import com.mycompany.gestione.dipendenti.aziendale.MODEL.Ruolo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class RuoloDAO {

    List<Ruolo> listaRuolo = new ArrayList<>();

    public void addRuolo(Ruolo ruolo) {
        listaRuolo.add(ruolo);
    }

    public boolean update(Ruolo newRuolo) {
        for (Ruolo ruolo : listaRuolo) {
            if (newRuolo.getIdRuolo() == ruolo.getIdRuolo()) {
                listaRuolo.add(newRuolo);
                System.out.println("Ruolo aggiornato");
                return true;
            }
        }
        System.out.println("Ruolo non trovato");
        return false;
    }

    public Ruolo searchRuolo(Ruolo ruoloId) {
        for (Ruolo ruolo : listaRuolo) {
            if (ruoloId.getIdRuolo() == ruolo.getIdRuolo()) {
                System.out.println("Trovato: " + ruoloId);
            }
        }
        return ruoloId;
    }
    
    //TODO Davide, creare il metodo per eliminare un ruolo
    
    
}
