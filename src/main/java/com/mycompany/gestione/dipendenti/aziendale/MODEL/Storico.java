/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione.dipendenti.aziendale.MODEL;

/**
 *
 * @author david
 */
public class Storico {
    private int idStorio;
    private int matricola;
    private Ruolo idRuolo;
    private int dataInizio;
    private int dataFine;

    public int getIdStorio() {
        return idStorio;
    }

    public void setIdStorio(int idStorio) {
        this.idStorio = idStorio;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public Ruolo getIdRuolo() {
        return idRuolo;
    }

    public void setIdRuolo(Ruolo idRuolo) {
        this.idRuolo = idRuolo;
    }

    public int getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(int dataInizio) {
        this.dataInizio = dataInizio;
    }

    public int getDataFine() {
        return dataFine;
    }

    public void setDataFine(int dataFine) {
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "Storico{" + "idStorio=" + idStorio + ", matricola=" + matricola + ", idRuolo=" + idRuolo + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + '}';
    }  
}
