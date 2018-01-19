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
    public boolean dodajDateBadaniaTechnicznego(String nrRejestracyjny, String dataBadania) {
        if (dowodRepository.dodajDateRejestracji(nrRejestracyjny, dataBadania) == 0)
            return false;
        else
            return true;
    }
}
