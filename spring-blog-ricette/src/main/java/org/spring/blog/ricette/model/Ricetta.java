package org.spring.blog.ricette.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class Ricetta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String titolo;
    private String ingredienti;
    private String url;

    private LocalTime tempoPreparazione;
    private Integer porzioni;
    private String testoRicetta;

    // getter  setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalTime getTempoPreparazione() {
        return tempoPreparazione;
    }

    public void setTempoPreparazione(LocalTime tempoPreparazione) {
        this.tempoPreparazione = tempoPreparazione;
    }

    public Integer getPorzioni() {
        return porzioni;
    }

    public void setPorzioni(Integer porzioni) {
        this.porzioni = porzioni;
    }

    public String getTestoRicetta() {
        return testoRicetta;
    }

    public void setTestoRicetta(String testoRicetta) {
        this.testoRicetta = testoRicetta;
    }

    // costruttore

    public Ricetta(Integer id, String titolo, String ingredienti, String url, LocalTime tempoPreparazione, Integer porzioni, String testoRicetta) {
        this.id = id;
        this.titolo = titolo;
        this.ingredienti = ingredienti;
        this.url = url;
        this.tempoPreparazione = tempoPreparazione;
        this.porzioni = porzioni;
        this.testoRicetta = testoRicetta;
    }

    public Ricetta(){

    }
}
