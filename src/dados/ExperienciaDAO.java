/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.dados;

import br.com.portalvagas.basicas.Experiencia;
import javax.persistence.EntityManager;

/**
 *
 * @author Caio Ernandes
 */
public class ExperienciaDAO extends GenericDAO<Long, Experiencia> {

    public ExperienciaDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
