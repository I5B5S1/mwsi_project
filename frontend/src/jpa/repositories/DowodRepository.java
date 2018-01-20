package jpa.repositories;

import jpa.entities.DowodEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import javax.transaction.Transactional;

public interface DowodRepository extends JpaRepository<DowodEntity, String> {

	@Transactional
	@Query(value = "SELECT * FROM dowodrejestracyjny"
			+ " WHERE   (nrRejestracyjny LIKE :nrRejestracyjny OR :nrRejestracyjny IS NULL) "
			+ "AND (seria LIKE :seria OR :seria IS NULL)" + "AND (numer LIKE :numer OR :numer IS NULL)"
			+ "AND (organWydajacy LIKE :organWydajacy OR :organWydajacy IS NULL)"
			+ "AND (dataRej LIKE :dataRej OR :dataRej IS NULL)" + "AND (krajRej LIKE :krajRej OR :krajRej IS NULL)"
			+ "AND (DataPierRej LIKE :dataPierwszejRej OR :dataPierwszejRej IS NULL)"
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
