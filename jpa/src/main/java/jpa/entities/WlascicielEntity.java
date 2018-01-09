package jpa.entities;

import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Proxy(lazy = false)
@Table(name = "wlascicielentity")
public class WlascicielEntity {

    @Id
    @Column(name = "PESEL")
    private String pesel;
    @Column(name = "Imie")
    private String imie;
    @Column(name = "Nazwisko")
    private String nazwisko;
    @Column(name = "DataUrodzenia")
    private String dataUrodzenia;
    @Column(name = "Miejscowosc")
    private String miejscowosc;
    @Column(name = "Ulica")
    private String ulica;
    @Column(name = "NrBudynku")
    private String nrBudynku;
    @Column(name = "NrLokalu")
    private String nrLokalu;
    @Column(name = "REGON")
    private String regon;

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData() {
        return dataUrodzenia;
    }

    public void setData(String data) {
        this.dataUrodzenia = data;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(String nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public String getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

}
