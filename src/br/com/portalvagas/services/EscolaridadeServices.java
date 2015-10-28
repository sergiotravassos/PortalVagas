/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.Escolaridade;
import br.com.portalvagas.dados.EscolaridadeDAO;
import br.com.portalvagas.dados.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 */
public class EscolaridadeServices {
    
    private final EscolaridadeDAO dao;

    private final SimpleEntityManager simpleEntityManager;

    public EscolaridadeServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new EscolaridadeDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Escolaridade escolaridade) {
        try {
            simpleEntityManager.beginTransaction();
            //escolaridade.validate();
            dao.save(escolaridade);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void delete(Escolaridade escolaridade) {
        try {
            simpleEntityManager.beginTransaction();
            //escolaridade.validate();
            dao.delete(escolaridade);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(Escolaridade escolaridade) {
        try {
            simpleEntityManager.beginTransaction();
            //escolaridade.validate();
            dao.update(escolaridade);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Escolaridade> findAll() {
        return dao.findAll();
    }
}
