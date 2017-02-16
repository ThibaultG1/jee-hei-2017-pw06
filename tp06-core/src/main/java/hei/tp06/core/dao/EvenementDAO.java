package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by thiba on 14/02/2017.
 */
public interface EvenementDAO extends JpaRepository<Evenement,Long>{

    Evenement findById(Long id);

    Evenement findByTitle(String title);

    Evenement findByStart(Timestamp start);

    void saveEvenement(Evenement evenement);

    List<Evenement> findAll();

    void deleteEvenement(Long id);
}
