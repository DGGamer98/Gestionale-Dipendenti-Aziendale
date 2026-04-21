/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione.dipendenti.aziendale.MODEL;

/**
 *
 * @author david
 */
public class Impiegato {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int matricola;

    public Impiegato(String nome, String cognome, String codiceFiscale, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "Impiegato{" + "nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", matricola=" + matricola + '}';
    }
    
    
    
}
