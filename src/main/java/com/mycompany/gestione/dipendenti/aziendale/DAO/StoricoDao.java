/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione.dipendenti.aziendale.DAO;

import com.mycompany.gestione.dipendenti.aziendale.MODEL.Storico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class StoricoDao {

    List<Storico> listStorico = new ArrayList<>();

    public void addStorico(Storico storico) {
        listStorico.add(storico);
    }

    public boolean update(Storico newStorico) {
        for (Storico storico : listStorico) {
            if (newStorico.getIdStorio() == storico.getIdStorio()) {
                listStorico.add(newStorico);
                System.out.println("Storico aggiornato");
                return true;
            }
        }
        return false;
    }

    public Storico searchStorico(Storico idStorico) {
        for (Storico storico : listStorico) {
            if (storico.getIdStorio() == storico.getIdStorio()) {
                System.out.println("Trovato: " + idStorico);
            }
        }
        return idStorico;
    }
    
    public void delete(Storico storico) {
        listStorico.remove(storico);
    }
}
