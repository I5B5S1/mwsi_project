package jpa.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jpa.entities.PojazdEntity;
@Repository
public interface PojazdRepository extends JpaRepository<PojazdEntity, String> {

	@Transactional
	@Query(value = "SELECT * FROM PojazdEntity" + " WHERE   (vin LIKE :vin OR :vin IS NULL) "
			+ "AND (marka LIKE :marka OR :marka IS NULL)" + "AND (model LIKE :model OR :model IS NULL)"
			+ "AND (generacja LIKE :generacja OR :generacja IS NULL)"
			+ "AND (typNadwozia LIKE :typNadwozia OR :typNadwozia IS NULL)"
			+ "AND (iloscMiejsc LIKE :iloscMiejsc OR :iloscMiejsc IS NULL)"
			+ "AND (pojemnoscSilnika LIKE :pojemnoscSilnika OR :pojemnoscSilnika IS NULL)"
			+ "AND  (moc = :moc OR :moc IS NULL)"
			+ "AND  (seriaKartyPojazdu = :seriaKartyPojazdu OR :seriaKartyPojazdu IS NULL)"
			+ "AND  (NrKartyPojazdu = :NrKartyPojazdu OR :NrKartyPojazdu IS NULL)"
			+ "AND  (maxMasaCalkowita = :maxMasaCalkowita OR :maxMasaCalkowita IS NULL)"
			+ "AND  (masaWlasna = :masaWlasna OR :masaWlasna IS NULL)"
			+ "AND  (liczbaOsi = :liczbaOsi OR :liczbaOsi IS NULL)"
			+ "AND  (pojazdSpecjalny = :pojazdSpecjalny OR :pojazdSpecjalny IS NULL)"
			+ "AND  (kradziezPojazdu = :kradziezPojazdu OR :kradziezPojazdu IS NULL)"
			+ "AND  (odnalezieniePojazdu = :odnalezieniePojazdu OR :odnalezieniePojazdu IS NULL)"
			+ "AND  (utrataTablicRejestracyjnych = :utrataTablicRejestracyjnych OR :utrataTablicRejestracyjnych IS NULL)"
			+ "AND  (odnalezienieTablicRejestracyjnych = :odnalezienieTablicRejestracyjnych OR :odnalezienieTablicRejestracyjnych IS NULL)"
			+ "AND  (utrataKartyPojazdu = :utrataKartyPojazdu OR :utrataKartyPojazdu IS NULL)"
			+ "AND  (odnalezienieaKartyPojazdu = :odnalezienieaKartyPojazdu OR :odnalezienieaKartyPojazdu IS NULL)"

			, nativeQuery = true)
	List<PojazdEntity> pobierzPojazdy(@Param("vin") String vin, @Param("marka") String marka,
			@Param("model") String model, @Param("generacja") String generacja,
			@Param("typNadwozia") String typNadwozia, @Param("iloscMiejsc") Integer iloscMiejsc,
			@Param("pojemnoscSilnika") Integer pojemnoscSilnika, @Param("moc") Integer moc,
			@Param("seriaKartyPojazdu") String seriaKartyPojazdu, @Param("NrKartyPojazdu") String NrKartyPojazdu,
			@Param("maxMasaCalkowita") Integer maxMasaCalkowita, @Param("masaWlasna") Integer masaWlasna,
			@Param("liczbaOsi") Integer liczbaOsi, @Param("pojazdSpecjalny") Boolean pojazdSpecjalny,
			@Param("kradziezPojazdu") String kradziezPojazdu, @Param("odnalezieniePojazdu") String odnalezieniePojazdu,
			@Param("utrataTablicRejestracyjnych") String utrataTablicRejestracyjnych,
			@Param("odnalezienieTablicRejestracyjnych") String odnalezienieTablicRejestracyjnych,
			@Param("utrataKartyPojazdu") String utrataKartyPojazdu,
			@Param("odnalezienieaKartyPojazdu") String odnalezienieaKartyPojazdu);

}
