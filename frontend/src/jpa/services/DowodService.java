package jpa.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Component;

import jpa.api.DowodRepositoryApi;
import jpa.entities.DowodEntity;
import jpa.repositories.DowodRepository;
import main.webapp.utils.EntityUpdater;

@Component
public class DowodService implements DowodRepositoryApi {

	@Autowired
	private DowodRepository dowodRepository;

	@Override
	public void dodajDowodRejestracyjny(DowodEntity dowodEntity) {
		try {
			DowodEntity entityToUpdate = dowodRepository.getOne(dowodEntity.getNrRejestracyjny());
			EntityUpdater.updateEntity(entityToUpdate, dowodEntity);
			dowodRepository.save(entityToUpdate);

		} catch (EntityNotFoundException | JpaObjectRetrievalFailureException | InvalidDataAccessApiUsageException e) {
			dowodRepository.save(dowodEntity);
		}
	}

	@Override
	public List<DowodEntity> pobierzDowody(String nrRejestracyjny, String seria, String numer, String organWydajacy,
			String dataRej, String krajRej, String dataPierwszejRej, String okresWaznosci, String dataBadania,
			String dataNastBadania, String utrataDowoduRejestracyjnego, String odnalezienieDowoduRejestracyjnego) {
		return dowodRepository.pobierzDowody(nrRejestracyjny, seria, numer, organWydajacy, dataRej, krajRej,
				dataPierwszejRej, okresWaznosci, dataBadania, dataNastBadania, utrataDowoduRejestracyjnego,
				odnalezienieDowoduRejestracyjnego);
	}

}
