package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Named
@Transactional
public class EvenementServiceImpl implements EvenementService{

    @Inject
    EvenementDAO evenementDAO;

    public Evenement findById(Long id) {
        return evenementDAO.findById(id);
    }

    public Evenement findByTitle(String title){
        return evenementDAO.findByTitle(title);
    }

    public Evenement findByStart(Timestamp start){
        return  evenementDAO.findByStart(start);
    }

    public List<Evenement> findAll(){return evenementDAO.findAll(); }

    public void save(Evenement evenement){ evenementDAO.save(evenement); }
/*
    @Override
    public void deleteEvenement(long id){
        evenementDAO.deleteEv(id);
    }*/
}
