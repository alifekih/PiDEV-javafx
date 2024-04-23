package esprit.monstergym.demo.Entities;

import java.sql.Date;

public class Reservation {

    private int id;
    private Cours cours;
    private String nom;
    private String email;
    private String adresse;
    private int nbrPlaces;
    private Date temp;

    public Reservation(int id, Cours cours, String nom, String email, String adresse, int nbrPlaces, Date temp) {
        this.id = id;
        this.cours = cours;
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.nbrPlaces = nbrPlaces;
        this.temp = temp;
    }

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
