/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.Experiencia;
import br.com.portalvagas.dados.ExperienciaDAO;
import br.com.portalvagas.dados.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 * 
 * As classes Services farão o trabalho de iniciar uma transação, commitar ou dar rollback
 */
public class ExperienciaServices {
    
    private ExperienciaDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public ExperienciaServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new ExperienciaDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Experiencia experiencia) {
        try {
            simpleEntityManager.beginTransaction();
            experiencia.validate();
            dao.save(experiencia);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(Experiencia experiencia) {
        try {
            simpleEntityManager.beginTransaction();
            experiencia.validate();
            dao.delete(experiencia);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(Experiencia experiencia) {
        try {
            simpleEntityManager.beginTransaction();
            experiencia.validate();
            dao.update(experiencia);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Experiencia> findAll() {
        return dao.findAll();
    }
}
