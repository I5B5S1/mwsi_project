package jpa.api;

import java.util.List;

import jpa.entities.PojazdEntity;

public interface PojazdRepositoryApi {
	PojazdEntity pobierzPojazd(String vin);

	public List<PojazdEntity> pobierzPojazdy(String vin, String marka, String model, String generacja,
			String typNadwozia, Integer iloscMiejsc, Integer pojemnoscSilnika, Integer moc, String seriaKartyPojazdu,
			String NrKartyPojazdu, Integer maxMasaCalkowita, Integer masaWlasna, Integer liczbaOsi,
			Boolean pojazdSpecjalny, String kradziezPojazdu, String odnalezieniePojazdu,
			String utrataTablicRejestracyjnych, String odnalezienieTablicRejestracyjnych, String utrataKartyPojazdu,
			String odnalezienieaKartyPojazdu);

	void dodajPojazd(PojazdEntity pojazdEntity);
}
