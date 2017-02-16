package hei.tp06.web.controller.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.web.controller.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.*;
import java.util.List;


@Named
@Path("/tp06-web")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {


    private static final Logger logger = LoggerFactory.getLogger(RestControllerImpl.class);

    @Inject
    private EvenementService evenementService;

    @GET
    @Path("/evenements")
    public List<Evenement> getEvenements()
    {
        return evenementService.findAll();
    }


    @GET
    @Path("/evenements/{id}")
    public Evenement getEvenement(@PathParam("id") Long id){
        logger.info("Liste des évenements retournée");
       return evenementService.findById(id);
    }

    @POST
    @Path("/evenements")
    @Consumes("application/json")
    public void setEvenement(Evenement evenement){
        logger.info("Evénement enregistré");
        evenementService.save(evenement);

    }

}
