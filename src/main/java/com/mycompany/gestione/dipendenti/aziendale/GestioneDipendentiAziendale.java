/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestione.dipendenti.aziendale;

import com.mycompany.gestione.dipendenti.aziendale.DAO.ImpiegatoDAO;
import com.mycompany.gestione.dipendenti.aziendale.MODEL.Impiegato;

/**
 *
 * @author david
 */
public class GestioneDipendentiAziendale {

    public static void main(String[] args) {

        ImpiegatoDAO impiegatodao = new ImpiegatoDAO();

        Impiegato impiegato = new Impiegato("Davide", "Gatta", "ABCDEFGHI307", 032064);
        Impiegato impiegato2 = new Impiegato("Luca", "Rossi", "ABCDEFGHI308", 123456);

        impiegatodao.addImpiegato(impiegato);
        impiegatodao.addImpiegato(impiegato2);
        
        impiegatodao.stampaLista();
        
        System.out.println(impiegatodao.searchCodiceFiscale("ABCDEFGHI307")); 
        
        impiegatodao.update(impiegato);
        
        System.out.println("x---------------\n");
        impiegatodao.elimina("ABCDEFGHI307");
        impiegatodao.stampaLista();


    }
}
