/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.oldcandidato;
import br.com.portalvagas.dados.CandidatoDAO;
import br.com.portalvagas.dados.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 * 
 * 
 * As classes Services farão o trabalho de iniciar uma transação, commitar ou dar rollback
 */
public class CandidatoServices {

    private final CandidatoDAO dao;

    private final SimpleEntityManager simpleEntityManager;

    public CandidatoServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new CandidatoDAO(simpleEntityManager.getEntityManager());
    }

    public void save(oldcandidato candidato) {
        try {
            simpleEntityManager.beginTransaction();
            //candidato.validate();
            dao.save(candidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void delete(oldcandidato candidato) {
        try {
            simpleEntityManager.beginTransaction();
            //candidato.validate();
            dao.delete(candidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(oldcandidato candidato) {
        try {
            simpleEntityManager.beginTransaction();
            //candidato.validate();
            dao.update(candidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<oldcandidato> findAll() {
        return dao.findAll();
    }
}
