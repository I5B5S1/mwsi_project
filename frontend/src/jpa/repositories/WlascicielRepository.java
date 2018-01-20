package jpa.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jpa.entities.WlascicielEntity;

@Repository
public interface WlascicielRepository extends JpaRepository<WlascicielEntity, String> {
	@Transactional
	@Query(value = "SELECT * FROM wlascicielEntity"
			+ " WHERE   (pesel LIKE :pesel OR :pesel IS NULL) "
			+ "AND (imie LIKE :imie OR :imie IS NULL)" + "AND (nazwisko LIKE :nazwisko OR :nazwisko IS NULL)"
			+ "AND (dataUrodzenia LIKE :dataUrodzenia OR :dataUrodzenia IS NULL)"
			+ "AND (miejscowosc LIKE :miejscowosc OR :miejscowosc IS NULL)" + "AND (ulica LIKE :ulica OR :ulica IS NULL)"
			+ "AND (nrBudynku LIKE :nrBudynku OR :nrBudynku IS NULL)"
			+ "AND  (nrLokalu = :nrLokalu OR :nrLokalu IS NULL)"
			+ "AND  (regon = :regon OR :regon IS NULL)", nativeQuery = true)
	List<WlascicielEntity> pobierzWlascicieli(@Param("pesel") String pesel, @Param("imie") String imie,
			@Param("nazwisko") String nazwisko, @Param("dataUrodzenia") String dataUrodzenia,
			@Param("miejscowosc") String miejscowosc, @Param("ulica") String ulica,
			@Param("nrBudynku") String nrBudynku, @Param("nrLokalu") String nrLokalu,
			@Param("regon") String regon);
}
