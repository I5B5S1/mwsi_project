package jpa.repositories;

import jpa.entities.DowodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface DowodRepository extends JpaRepository<DowodEntity, String> {

    @Modifying
    @Transactional
    @Query("UPDATE DowodEntity SET dataBadania = :dataBadania WHERE nrRejestracyjny = :nrRejestracyjny")
    void dodajDateRejestracji(@Param("nrRejestracyjny") String nrRejestracyjny, @Param("dataBadania") String dataBadania);
}
