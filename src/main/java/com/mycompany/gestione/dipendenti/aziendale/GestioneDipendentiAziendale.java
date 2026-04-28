/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestione.dipendenti.aziendale;

import com.mycompany.gestione.dipendenti.aziendale.DAO.ImpiegatoDAO;
import com.mycompany.gestione.dipendenti.aziendale.DAO.RuoloDAO;
import com.mycompany.gestione.dipendenti.aziendale.DAO.StoricoDao;
import com.mycompany.gestione.dipendenti.aziendale.MODEL.Impiegato;

/**
 *
 * @author david
 */
public class GestioneDipendentiAziendale {

    public static void main(String[] args) {

        ImpiegatoDAO impiegatodao = new ImpiegatoDAO();
        RuoloDAO ruolodao = new RuoloDAO();
        StoricoDao storicodao = new StoricoDao();
        
        Impiegato impiegato2 = new Impiegato("Luca", "Rossi", "ABCDEFGHI308", 123456);
        Impiegato impiegato = new Impiegato("Davide", "Gatta", "ABCDEFGHI307", 032064);
        Impiegato impiegato3 = new Impiegato("Mario", "Verde", "ABCDEFGHI400", 776934);
        
        impiegatodao.addImpiegato(impiegato);
        impiegatodao.addImpiegato(impiegato2);
        
        System.out.println("x----------");
        System.out.println(impiegatodao.searchCodiceFiscale("ABCDEFGHI308"));
        
        impiegatodao.update(impiegato, impiegato3);
        
        impiegatodao.stampaLista();
        
        

        
        
    
        










        
        
        


    }
}
