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
    private Integer iloscMiejsc;
    @Column(name = "PojemnoscSilnika")
    private Integer pojemnoscSilnika;
    @Column(name = "Moc")
    private Integer moc;
    @Column(name = "SeriaKartyPojazdu")
    private String seriaKartyPojazdu;
    @Column(name = "NrKartyPojazdu")
    private String NrKartyPojazdu;
    @Column(name = "MaxMasaCalkowita")
    private Integer maxMasaCalkowita;
    @Column(name = "MasaWlasna")
    private Integer masaWlasna;
    @Column(name = "LiczbaOsi")
    private Integer liczbaOsi;
    @Column(name = "PojazdSpecjalny")
    private Boolean pojazdSpecjalny;
    @Column(name = "KradziezPojazdu")
    private String kradziezPojazdu;
    @Column(name = "OdnalezieniePojazdu")
    private String odnalezieniePojazdu;
    @Column(name = "UtrataTablicRejestracyjnych")
    private String utrataTablicRejestracyjnych;
    @Column(name = "OdnalezienieTablicRejestracyjnych")
    private String odnalezienieTablicRejestracyjnych;
    @Column(name = "UtrataKartyPojazdu")
    private String utrataKartyPojazdu;
    @Column(name = "OdnalezienieaKartyPojazdu")
    private String odnalezienieaKartyPojazdu;
    

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

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(Integer iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public Integer getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(Integer pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public Integer getMoc() {
        return moc;
    }

    public void setMoc(Integer moc) {
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

    public Integer getMaxMasaCalkowita() {
        return maxMasaCalkowita;
    }

    public void setMaxMasaCalkowita(Integer maxMasaCalkowita) {
        this.maxMasaCalkowita = maxMasaCalkowita;
    }

    public Integer getMasaWlasna() {
        return masaWlasna;
    }

    public void setMasaWlasna(Integer masaWlasna) {
        this.masaWlasna = masaWlasna;
    }

    public Integer getLiczbaOsi() {
        return liczbaOsi;
    }

    public void setLiczbaOsi(Integer liczbaOsi) {
        this.liczbaOsi = liczbaOsi;
    }

	public Boolean getPojazdSpecjalny() {
		return pojazdSpecjalny;
	}

	public void setPojazdSpecjalny(Boolean pojazdSpecjalny) {
		this.pojazdSpecjalny = pojazdSpecjalny;
	}

	public String getKradziezPojazdu() {
		return kradziezPojazdu;
	}

	public void setKradziezPojazdu(String kradziezPojazdu) {
		this.kradziezPojazdu = kradziezPojazdu;
	}

	public String getOdnalezieniePojazdu() {
		return odnalezieniePojazdu;
	}

	public void setOdnalezieniePojazdu(String odnalezieniePojazdu) {
		this.odnalezieniePojazdu = odnalezieniePojazdu;
	}

	public String getUtrataTablicRejestracyjnych() {
		return utrataTablicRejestracyjnych;
	}

	public void setUtrataTablicRejestracyjnych(String utrataTablicRejestracyjnych) {
		this.utrataTablicRejestracyjnych = utrataTablicRejestracyjnych;
	}

	public String getOdnalezienieTablicRejestracyjnych() {
		return odnalezienieTablicRejestracyjnych;
	}

	public void setOdnalezienieTablicRejestracyjnych(String odnalezienieTablicRejestracyjnych) {
		this.odnalezienieTablicRejestracyjnych = odnalezienieTablicRejestracyjnych;
	}

	public String getUtrataKartyPojazdu() {
		return utrataKartyPojazdu;
	}

	public void setUtrataKartyPojazdu(String utrataKartyPojazdu) {
		this.utrataKartyPojazdu = utrataKartyPojazdu;
	}

	public String getOdnalezienieaKartyPojazdu() {
		return odnalezienieaKartyPojazdu;
	}

	public void setOdnalezienieaKartyPojazdu(String odnalezienieaKartyPojazdu) {
		this.odnalezienieaKartyPojazdu = odnalezienieaKartyPojazdu;
	}
}
