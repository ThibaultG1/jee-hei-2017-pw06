package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;

import java.util.Date;
import java.util.List;

/**
 * Created by thiba on 14/02/2017.
 */
public interface EvenementService {

    List<Evenement> findByTitle(String title);

    List<Evenement> findByStart(Date start);

    void saveEvenement(Evenement evenement);

    List<Evenement> findAll();

    void deleteEvenement(long id);
}
