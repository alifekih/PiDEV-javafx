package esprit.monstergym.demo.Entities;

import java.sql.Date;

public class Cours {
    private int id;
    private String nom;
    private String jours;
    private String duree;
    private String niveau;
    private int nbrPlaces;
    private Date temp;

    public Cours(int id, String nom, String jours, String duree, String niveau, int nbrPlaces, Date temp) {
        this.id = id;
        this.nom = nom;
        this.jours = jours;
        this.duree = duree;
        this.niveau = niveau;
        this.nbrPlaces = nbrPlaces;
        this.temp = temp;
    }

    public Cours() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getJours() {
        return jours;
    }

    public void setJours(String jours) {
        this.jours = jours;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public Date getTemp() {
        return temp;
    }

    public void setTemp(Date temp) {
        this.temp = temp;
    }
}
