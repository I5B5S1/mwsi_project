package jpa.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Component;

import jpa.api.PojazdRepositoryApi;
import jpa.entities.PojazdEntity;
import jpa.repositories.PojazdRepository;
import main.webapp.utils.EntityUpdater;

@Component
public class PojazdService implements PojazdRepositoryApi {

	@Autowired
	private PojazdRepository pojazdRepository;

	@Override
	public PojazdEntity pobierzPojazd(String vin) {
		return pojazdRepository.getOne(vin);
	}

	public List<PojazdEntity> pobierzPojazdy(String vin, String marka, String model, String generacja,
			String typNadwozia, Integer iloscMiejsc, Integer pojemnoscSilnika, Integer moc, String seriaKartyPojazdu,
			String NrKartyPojazdu, Integer maxMasaCalkowita, Integer masaWlasna, Integer liczbaOsi,
			Boolean pojazdSpecjalny, String kradziezPojazdu, String odnalezieniePojazdu,
			String utrataTablicRejestracyjnych, String odnalezienieTablicRejestracyjnych, String utrataKartyPojazdu,
			String odnalezienieaKartyPojazdu) {
		return pojazdRepository.pobierzPojazdy(vin, marka, model, generacja, typNadwozia, iloscMiejsc, pojemnoscSilnika,
				moc, seriaKartyPojazdu, NrKartyPojazdu, maxMasaCalkowita, masaWlasna, liczbaOsi, pojazdSpecjalny,
				kradziezPojazdu, odnalezieniePojazdu, utrataTablicRejestracyjnych, odnalezienieTablicRejestracyjnych,
				utrataKartyPojazdu, odnalezienieaKartyPojazdu);
	}

	@Override
	public void dodajPojazd(PojazdEntity pojazdEntity) {
		try {
			PojazdEntity entityToUpdate = pojazdRepository.getOne(pojazdEntity.getVin());
			EntityUpdater.updateEntity(entityToUpdate, pojazdEntity);
			pojazdRepository.save(entityToUpdate);
			
		} catch (EntityNotFoundException | JpaObjectRetrievalFailureException e) {
			pojazdRepository.save(pojazdEntity);
		}
	}

}
