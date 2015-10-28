/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.negocio;

import br.com.portalvagas.basicas.Vaga;
import br.com.portalvagas.dados.SimpleEntityManager;
import br.com.portalvagas.services.VagaServices;

/**
 *
 * @author Caio Ernandes
 */
public class VagaNegocio {

    String persistenceUnitName = "PortalVagas";
    SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);

    public void save(Vaga vaga) throws Exception {
        if (vaga.getTituloVaga().equals("") || vaga.getTituloVaga() == null) {
            throw new Exception("O nome da vaga está vazio ou pode estar nulo.");
        } else if (vaga.getLocalVaga().length() < 4) {
            throw new Exception("O campo de endereço não pode conter menos que 4 caracteres.");
        } else {
            VagaServices vs = new VagaServices(simpleEntityManager);
            vs.save(vaga);
            simpleEntityManager.close();
        }
    }

    public void update(Vaga vaga) throws Exception {
        if (vaga.getId() < 0) {
            throw new Exception("O código não pode ser menor que zero.");
        } else if (vaga.getTituloVaga().equals("") || vaga.getTituloVaga() == null) {
            throw new Exception("O nome da vaga está vazio ou pode estar nulo.");
        } else if (vaga.getLocalVaga().length() < 4) {
            throw new Exception("O campo de endereço não pode conter menos que 4 caracteres.");
        } else {
            VagaServices vs = new VagaServices(simpleEntityManager);
            vs.update(vaga);
            simpleEntityManager.close();
        }
    }

    public void delete(Vaga vaga) throws Exception {
        if (vaga.getId() < 0) {
            throw new Exception("O código não pode ser menor que zero.");
        } else {
            VagaServices vs = new VagaServices(simpleEntityManager);
            vs.delete(vaga);
            simpleEntityManager.close();
        }
    }

    public void listAll() throws Exception {
        VagaServices vs = new VagaServices(simpleEntityManager);
        vs.findAll();
        simpleEntityManager.close();
    }
}
