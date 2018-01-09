package jpa.services;

import jpa.api.DowodRepositoryApi;
import jpa.repositories.DowodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DowodService implements DowodRepositoryApi {

    @Autowired
    private DowodRepository dowodRepository;

    @Override
    public void dodajDateBadaniaTechnicznego(String nrRejestracyjny, String dataBadania) {
        dowodRepository.dodajDateRejestracji(nrRejestracyjny, dataBadania);
    }
}
