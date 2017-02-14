package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.List;

@Named
@Transactional
public class EvenementServiceImpl implements EvenementService{

    @Inject
    private EvenementDAO evenementDAO;

    @Override
    public List<Evenement> findById(Long id) {
        return evenementDAO.findById(id);
    }

    @Override
    public List<Evenement> findByTitle(String title){
        return evenementDAO.findByTitle(title);
    }

    @Override
    public List<Evenement> findByStart(Date start){
        return  evenementDAO.findByStart(start);
    }

    @Override
    public void saveEvenement(Evenement evenement){
        evenementDAO.save(evenement);
    }

    @Override
    public List<Evenement> findAll(){
        return evenementDAO.findAll();
    }

    @Override
    public void deleteEvenement(long id){
        evenementDAO.delete(id);
    }
}
