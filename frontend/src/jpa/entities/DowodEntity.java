package jpa.entities;


import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Proxy(lazy = false)
@Table(name = "dowodrejestracyjny")
public class DowodEntity {

    @Id
    @Column(name = "NrRejestracyjny")
    private String nrRejestracyjny;
    @Column(name = "Seria")
    private String seria;
    @Column(name = "Numer")
    private String numer;
    @Column(name = "OrganWydajacy")
    private String organWydajacy;
    @Column(name = "DataRej")
    private String dataRej;
    @Column(name = "KrajRej")
    private String krajRej;
    @Column(name = "DataPierRej")
    private String dataPierwszejRej;
    @Column(name = "OkresWaznosci")
    private String okresWaznosci;
    @Column(name = "DataBadania")
    private String dataBadania;
    @Column(name = "DataNastBadania")
    private String dataNastBadania;
    @Column(name = "UtrataDowoduRejestracyjnego")
    private String utrataDowoduRejestracyjnego;
    @Column(name = "OdnalezienieDowoduRejestracyjnego")
    private String odnalezienieDowoduRejestracyjnego;
    

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getOrganWydajacy() {
        return organWydajacy;
    }

    public void setOrganWydajacy(String organWydajacy) {
        this.organWydajacy = organWydajacy;
    }

    public String getDataRej() {
        return dataRej;
    }

    public void setDataRej(String dataRej) {
        this.dataRej = dataRej;
    }

    public String getKrajRej() {
        return krajRej;
    }

    public void setKrajRej(String krajRej) {
        this.krajRej = krajRej;
    }

    public String getDataPierwszejRej() {
        return dataPierwszejRej;
    }

    public void setDataPierwszejRej(String dataPierwszejRej) {
        this.dataPierwszejRej = dataPierwszejRej;
    }

    public String getOkresWaznosci() {
        return okresWaznosci;
    }

    public void setOkresWaznosci(String okresWaznosci) {
        this.okresWaznosci = okresWaznosci;
    }

    public String getDataBadania() {
        return dataBadania;
    }

    public void setDataBadania(String dataBadania) {
        this.dataBadania = dataBadania;
    }

    public String getDataNastBadania() {
        return dataNastBadania;
    }

    public void setDataNastBadania(String dataNastBadania) {
        this.dataNastBadania = dataNastBadania;
    }

	public String getUtrataDowoduRejestracyjnego() {
		return utrataDowoduRejestracyjnego;
	}

	public void setUtrataDowoduRejestracyjnego(String utrataDowoduRejestracyjnego) {
		this.utrataDowoduRejestracyjnego = utrataDowoduRejestracyjnego;
	}

	public String getOdnalezienieDowoduRejestracyjnego() {
		return odnalezienieDowoduRejestracyjnego;
	}

	public void setOdnalezienieDowoduRejestracyjnego(String odnalezienieDowoduRejestracyjnego) {
		this.odnalezienieDowoduRejestracyjnego = odnalezienieDowoduRejestracyjnego;
	}

}
