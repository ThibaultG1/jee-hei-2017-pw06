package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by thiba on 14/02/2017.
 */
public interface EvenementService {

    Evenement findById(Long id);

    Evenement findByTitle(String title);

    Evenement findByStart(Timestamp start);


    List<Evenement> findAll();

   /* void save(Evenement evenement);


    void deleteEvenement(long id);*/
}
