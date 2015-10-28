/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.testes;

import br.com.portalvagas.basicas.oldcandidato;
import br.com.portalvagas.dados.SimpleEntityManager;
import br.com.portalvagas.basicas.Vaga;
import br.com.portalvagas.services.CandidatoServices;
import br.com.portalvagas.services.VagaServices;

/**
 *
 * @author Sérgio Travassos
 */
public class Principal {

    public static void main(String[] args) {
        String persistenceUnitName = "PortalVagas";

        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);

        CandidatoServices candidatoService = new CandidatoServices(simpleEntityManager);
        //EmpresaServices empresaServices = new EmpresaServices(simpleEntityManager);
        
        oldcandidato c = new oldcandidato();

        //aqui seta os valores de candidato para salvar no bd
        
        candidatoService.save(c);
        
        VagaServices vs = new VagaServices();
        
        for(Vaga vagas : vs.findAll()) {
            System.out.println(vagas.getId() + " - " + vagas.getTituloVaga());
        }
        
        simpleEntityManager.close();
    }
}
