package jpa.entities;


import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Proxy(lazy = false)
@Table(name = "pojazdentity")
public class PojazdEntity {

    @Id
    @Column(name = "VIN")
    private String vin;

    @Column(name = "Marka")
    private String marka;
    @Column(name = "Model")
    private String model;
    @Column(name = "Generacja")
    private String generacja;
    @Column(name = "TypNadwozia")
    private String typNadwozia;
    @Column(name = "IloscMiejsc")
    private int iloscMiejsc;
    @Column(name = "PojemnoscSilnika")
    private int pojemnoscSilnika;
    @Column(name = "Moc")
    private int moc;
    @Column(name = "SeriaKartyPojazdu")
    private String seriaKartyPojazdu;
    @Column(name = "NrKartyPojazdu")
    private String NrKartyPojazdu;
    @Column(name = "MaxMasaCalkowita")
    private int maxMasaCalkowita;
    @Column(name = "MasaWlasna")
    private int masaWlasna;
    @Column(name = "LiczbaOsi")
    private int liczbaOsi;

    public PojazdEntity() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneracja() {
        return generacja;
    }

    public void setGeneracja(String generacja) {
        this.generacja = generacja;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public void setTypNadwozia(String typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getSeriaKartyPojazdu() {
        return seriaKartyPojazdu;
    }

    public void setSeriaKartyPojazdu(String seriaKartyPojazdu) {
        this.seriaKartyPojazdu = seriaKartyPojazdu;
    }

    public String getNrkartypojazdu() {
        return NrKartyPojazdu;
    }

    public void setNrkartypojazdu(String NrKartyPojazdu) {
        this.NrKartyPojazdu = NrKartyPojazdu;
    }

    public int getMaxMasaCalkowita() {
        return maxMasaCalkowita;
    }

    public void setMaxMasaCalkowita(int maxMasaCalkowita) {
        this.maxMasaCalkowita = maxMasaCalkowita;
    }

    public int getMasaWlasna() {
        return masaWlasna;
    }

    public void setMasaWlasna(int masaWlasna) {
        this.masaWlasna = masaWlasna;
    }

    public int getLiczbaOsi() {
        return liczbaOsi;
    }

    public void setLiczbaOsi(int liczbaOsi) {
        this.liczbaOsi = liczbaOsi;
    }
}
