package jpa.repositories;

import jpa.entities.DowodEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface DowodRepository extends JpaRepository<DowodEntity, String> {

	@Transactional
	@Query(value = "SELECT * FROM dowodrejestracyjny"
			+ " WHERE   (nrRejestracyjny = :nrRejestracyjny OR :nrRejestracyjny IS NULL) "
			+ "AND (seria = :seria OR :seria IS NULL)" + "AND (numer = :numer OR :numer IS NULL)"
			+ "AND (organWydajacy = :organWydajacy OR :organWydajacy IS NULL)"
			+ "AND (dataRej = :dataRej OR :dataRej IS NULL)" + "AND (krajRej = :krajRej OR :krajRej IS NULL)"
			+ "AND (DataPierRej = :dataPierwszejRej OR :dataPierwszejRej IS NULL)"
			+ "AND  (okresWaznosci = :okresWaznosci OR :okresWaznosci IS NULL)"
			+ "AND  (dataBadania = :dataBadania OR :dataBadania IS NULL)"
			+ "AND  (dataNastBadania = :dataNastBadania OR :dataNastBadania IS NULL)"
			+ "AND  (utrataDowoduRejestracyjnego = :utrataDowoduRejestracyjnego OR :utrataDowoduRejestracyjnego IS NULL)"
			+ "AND  (odnalezienieDowoduRejestracyjnego = :odnalezienieDowoduRejestracyjnego OR :odnalezienieDowoduRejestracyjnego IS NULL)", nativeQuery = true)
	List<DowodEntity> pobierzDowody(@Param("nrRejestracyjny") String nrRejestracyjny, @Param("seria") String seria,
			@Param("numer") String numer, @Param("organWydajacy") String organWydajacy,
			@Param("dataRej") String dataRej, @Param("krajRej") String krajRej,
			@Param("dataPierwszejRej") String dataPierwszejRej, @Param("okresWaznosci") String okresWaznosci,
			@Param("dataBadania") String dataBadania, @Param("dataNastBadania") String dataNastBadania,
			@Param("utrataDowoduRejestracyjnego") String utrataDowoduRejestracyjnego,
			@Param("odnalezienieDowoduRejestracyjnego") String odnalezienieDowoduRejestracyjnego);
}
