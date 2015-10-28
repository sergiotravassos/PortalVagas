/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.services;

import br.com.portalvagas.basicas.Empresa;
import br.com.portalvagas.dados.EmpresaDAO;
import br.com.portalvagas.dados.SimpleEntityManager;
import java.util.List;

/**
 *
 * @author Caio Ernandes
 * 
 * As classes Services farão o trabalho de iniciar uma transação, commitar ou dar rollback
 */
public class EmpresaServices {

    private EmpresaDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public EmpresaServices(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        dao = new EmpresaDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Empresa empresa) {
        try {
            simpleEntityManager.beginTransaction();
            //empresa.validate();
            dao.save(empresa);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(Empresa empresa) {
        try {
            simpleEntityManager.beginTransaction();
            //empresa.validate();
            dao.delete(empresa);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void update(Empresa empresa) {
        try {
            simpleEntityManager.beginTransaction();
            //empresa.validate();
            dao.update(empresa);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Empresa> findAll() {
        return dao.findAll();
    }
}
