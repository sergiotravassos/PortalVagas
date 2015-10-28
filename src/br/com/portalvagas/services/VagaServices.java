/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.Vaga;
import br.com.portalvagas.dados.SimpleEntityManager;
import br.com.portalvagas.dados.VagaDAO;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 */
public class VagaServices {
    
    private VagaDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public VagaServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new VagaDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Vaga vaga) {
        try {
            simpleEntityManager.beginTransaction();
            //vaga.validate();
            dao.save(vaga);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(Vaga vaga) {
        try {
            simpleEntityManager.beginTransaction();
            //vaga.validate();
            
            dao.delete(vaga);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(Vaga vaga) {
        try {
            simpleEntityManager.beginTransaction();
            //vaga.validate();
            dao.update(vaga);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Vaga> findAll() {
        return dao.findAll();
    }
    
    public VagaServices() {}
}
