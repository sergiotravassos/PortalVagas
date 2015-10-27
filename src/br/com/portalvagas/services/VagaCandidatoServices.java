/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.VagaCandidato;
import br.com.portalvagas.dados.SimpleEntityManager;
import br.com.portalvagas.dados.VagaCandidatoDAO;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 */
public class VagaCandidatoServices {
    
    private VagaCandidatoDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public VagaCandidatoServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new VagaCandidatoDAO(simpleEntityManager.getEntityManager());
    }

    public void save(VagaCandidato vagaCandidato) {
        try {
            simpleEntityManager.beginTransaction();
            vagaCandidato.validate();
            dao.save(vagaCandidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(VagaCandidato vagaCandidato) {
        try {
            simpleEntityManager.beginTransaction();
            vagaCandidato.validate();
            dao.delete(vagaCandidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(VagaCandidato vagaCandidato) {
        try {
            simpleEntityManager.beginTransaction();
            vagaCandidato.validate();
            dao.update(vagaCandidato);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<VagaCandidato> findAll() {
        return dao.findAll();
    }
}
