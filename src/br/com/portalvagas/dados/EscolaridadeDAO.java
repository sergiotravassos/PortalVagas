/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.dados;

import br.com.portalvagas.basicas.Escolaridade;
import javax.persistence.EntityManager;

/**
 *
 * @author Caio Ernandes
 */
public class EscolaridadeDAO extends GenericDAO<Long, Escolaridade>{
    
    public EscolaridadeDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
