package jpa.api;

import java.util.List;

import jpa.entities.WlascicielEntity;

public interface WlascicielRepositoryApi {

	List<WlascicielEntity> pobierzWlascicieli(String pesel, String imie, String nazwisko, String dataUrodzenia,
			String miejscowosc, String ulica, String nrBudynku, String nrLokalu, String regon);
}
