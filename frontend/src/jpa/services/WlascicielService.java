package jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.api.WlascicielRepositoryApi;
import jpa.entities.WlascicielEntity;
import jpa.repositories.WlascicielRepository;

@Component
public class WlascicielService implements WlascicielRepositoryApi {
	@Autowired
	private WlascicielRepository wlascicielRepository;

	public List<WlascicielEntity> pobierzWlascicieli(String pesel, String imie, String nazwisko, String dataUrodzenia,
			String miejscowosc, String ulica, String nrBudynku, String nrLokalu, String regon) {
		return wlascicielRepository.pobierzWlascicieli(pesel, imie, nazwisko, dataUrodzenia, miejscowosc, ulica,
				nrBudynku, nrLokalu, regon);
	}

}
