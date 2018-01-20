package jpa.api;

import java.util.List;

import jpa.entities.DowodEntity;

public interface DowodRepositoryApi {
	void dodajDowodRejestracyjny(DowodEntity dowodEntity);

	List<DowodEntity> pobierzDowody(String nrRejestracyjny, String seria, String numer, String organWydajacy,
			String dataRej, String krajRej, String dataPierwszejRej, String okresWaznosci, String dataBadania,
			String dataNastBadania, String utrataDowoduRejestracyjnego, String odnalezienieDowoduRejestracyjnego);
}
